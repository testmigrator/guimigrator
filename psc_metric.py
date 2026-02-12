#!/usr/bin/env python3
"""
Compute Project-wide Semantic Coherence (PSC) between Android XML and migrated UI code.

PSC = (S + A + L) / 3
S: Structure coherence (node-type signature Jaccard)
A: Attribute coherence (style/property signature Jaccard)
L: Layout coherence (layout-relation signature Jaccard)

Usage:
  python3 python/psc_metric.py --xml source.xml --compose target.kt --swiftui target.swift
  python3 python/psc_metric.py --xml source.xml --compose target.kt --json
"""

from __future__ import annotations

import argparse
import json
import re
import xml.etree.ElementTree as ET
from dataclasses import dataclass
from pathlib import Path
from typing import Iterable, Set, Dict, List, Tuple


XML_NS_ANDROID = "{http://schemas.android.com/apk/res/android}"
XML_NS_TOOLS = "{http://schemas.android.com/tools}"


@dataclass
class Signatures:
    structure: Set[str]
    attrs: Set[str]
    layout: Set[str]


def jaccard(a: Set[str], b: Set[str]) -> float:
    if not a and not b:
        return 1.0
    if not a or not b:
        return 0.0
    return len(a & b) / len(a | b)


def round4(v: float) -> float:
    return round(v + 1e-12, 4)


def local_name(tag: str) -> str:
    if "}" in tag:
        return tag.split("}", 1)[1]
    return tag


def normalize_xml_tag(tag: str) -> str:
    t = local_name(tag)
    # Custom view -> fallback by class suffix heuristics.
    if "." in t:
        t = t.split(".")[-1]

    m = {
        "LinearLayout": "container.vertical_or_horizontal",
        "RelativeLayout": "container.relative",
        "FrameLayout": "container.overlay",
        "ConstraintLayout": "container.constraint",
        "ScrollView": "container.scroll",
        "HorizontalScrollView": "container.scroll_h",
        "RecyclerView": "list",
        "ListView": "list",
        "GridView": "grid",
        "TextView": "text",
        "Button": "button",
        "ImageButton": "button.image",
        "ImageView": "image",
        "EditText": "input",
        "AutoCompleteTextView": "input",
        "Spinner": "picker",
        "CheckBox": "toggle",
        "Switch": "toggle",
        "RadioGroup": "group.radio",
        "RadioButton": "toggle.radio",
        "TableLayout": "container.table",
        "TableRow": "container.row",
        "View": "spacer_or_divider",
    }
    if t in m:
        return m[t]
    # Common custom names fallback.
    if "Image" in t:
        return "image"
    if "Text" in t:
        return "text"
    return "custom"


def normalize_compose_name(name: str) -> str:
    m = {
        "Column": "container.vertical",
        "Row": "container.horizontal",
        "Box": "container.overlay",
        "LazyColumn": "list",
        "LazyRow": "list_h",
        "Text": "text",
        "Button": "button",
        "TextButton": "button",
        "OutlinedButton": "button",
        "Image": "image",
        "Icon": "image",
        "Spacer": "spacer_or_divider",
        "TextField": "input",
        "OutlinedTextField": "input",
        "Checkbox": "toggle",
        "Switch": "toggle",
        "RadioButton": "toggle.radio",
        "DropdownMenu": "picker",
        "ExposedDropdownMenuBox": "picker",
    }
    return m.get(name, "custom")


def normalize_swiftui_name(name: str) -> str:
    m = {
        "VStack": "container.vertical",
        "HStack": "container.horizontal",
        "ZStack": "container.overlay",
        "ScrollView": "container.scroll",
        "List": "list",
        "Text": "text",
        "Button": "button",
        "Image": "image",
        "Spacer": "spacer_or_divider",
        "TextField": "input",
        "SecureField": "input",
        "Toggle": "toggle",
        "Picker": "picker",
    }
    return m.get(name, "custom")


def _add_attr_sig_from_name_value(sigs: Set[str], name: str, value: str) -> None:
    n = name.lower()
    v = (value or "").lower()

    if n in {"layout_width", "layout_height", "width", "height"}:
        if "match_parent" in v or "fill_parent" in v:
            sigs.add("size.fill")
        elif "wrap_content" in v:
            sigs.add("size.wrap")
        else:
            sigs.add("size.fixed")

    if "layout_weight" in n or n == "weight":
        sigs.add("size.weight")
    if "padding" in n:
        sigs.add("spacing.padding")
    if "margin" in n:
        sigs.add("spacing.margin")
    if n == "textcolor" or "text_color" in n:
        sigs.add("text.color")
    if n == "textsize" or "text_size" in n:
        sigs.add("text.size")
    if n == "textstyle" and "bold" in v:
        sigs.add("text.bold")
    if n == "gravity":
        if "center" in v:
            sigs.add("align.center")
        if "start" in v or "left" in v:
            sigs.add("align.start")
        if "end" in v or "right" in v:
            sigs.add("align.end")
        if "top" in v:
            sigs.add("align.top")
        if "bottom" in v:
            sigs.add("align.bottom")
    if n == "orientation":
        if "horizontal" in v:
            sigs.add("orientation.horizontal")
        elif "vertical" in v:
            sigs.add("orientation.vertical")
    if n == "visibility":
        if "gone" in v:
            sigs.add("visibility.gone")
        elif "invisible" in v:
            sigs.add("visibility.invisible")
        elif "visible" in v:
            sigs.add("visibility.visible")


def extract_xml_signatures(xml_path: Path) -> Signatures:
    tree = ET.parse(xml_path)
    root = tree.getroot()

    structure: Set[str] = set()
    attrs: Set[str] = set()
    layout: Set[str] = set()

    def visit(node: ET.Element) -> None:
        tag = normalize_xml_tag(node.tag)
        structure.add(f"node:{tag}")

        orientation = node.get(XML_NS_ANDROID + "orientation")
        if tag == "container.vertical_or_horizontal":
            if orientation == "horizontal":
                layout.add("container.horizontal")
            elif orientation == "vertical":
                layout.add("container.vertical")

        if tag == "container.relative":
            layout.add("container.relative")
        if tag == "container.overlay":
            layout.add("container.overlay")
        if tag == "container.scroll" or tag == "list":
            layout.add("container.scroll_or_list")

        for k, v in node.attrib.items():
            name = local_name(k)
            _add_attr_sig_from_name_value(attrs, name, v)

            # RelativeLayout-related layout relations.
            if name in {
                "layout_toLeftOf",
                "layout_toRightOf",
                "layout_toStartOf",
                "layout_toEndOf",
            }:
                layout.add("rel.side")
            if name in {"layout_below", "layout_above"}:
                layout.add("rel.vertical_chain")
            if name.startswith("layout_alignParent"):
                layout.add("rel.align_parent")
            if name == "layout_centerVertical":
                layout.add("rel.center_vertical")
            if name == "layout_centerHorizontal":
                layout.add("rel.center_horizontal")
            if name == "gravity":
                if "center" in (v or ""):
                    layout.add("align.center")
                if "end" in (v or "") or "right" in (v or ""):
                    layout.add("align.end")
                if "start" in (v or "") or "left" in (v or ""):
                    layout.add("align.start")

        # tools:* is used as design-time truth in your experiments.
        tools_text = node.get(XML_NS_TOOLS + "text")
        if tools_text:
            attrs.add("tools.text")
        tools_vis = node.get(XML_NS_TOOLS + "visibility")
        if tools_vis:
            attrs.add("tools.visibility")
            _add_attr_sig_from_name_value(attrs, "visibility", tools_vis)

        for c in list(node):
            visit(c)

    visit(root)
    return Signatures(structure, attrs, layout)


def extract_compose_signatures(kt_path: Path) -> Signatures:
    code = kt_path.read_text(encoding="utf-8", errors="ignore")

    structure: Set[str] = set()
    attrs: Set[str] = set()
    layout: Set[str] = set()

    # Structure by composable calls.
    names = re.findall(r"\b([A-Z][A-Za-z0-9_]*)\s*\(", code)
    for n in names:
        structure.add(f"node:{normalize_compose_name(n)}")

    # Attribute/style signals.
    compose_attr_patterns: List[Tuple[str, str]] = [
        (r"fillMaxWidth\s*\(", "size.fill"),
        (r"fillMaxHeight\s*\(", "size.fill"),
        (r"wrapContentWidth\s*\(", "size.wrap"),
        (r"wrapContentHeight\s*\(", "size.wrap"),
        (r"\bwidth\s*\(", "size.fixed"),
        (r"\bheight\s*\(", "size.fixed"),
        (r"\.weight\s*\(", "size.weight"),
        (r"\.padding\s*\(", "spacing.padding"),
        (r"\.background\s*\(", "style.background"),
        (r"fontSize\s*=", "text.size"),
        (r"color\s*=", "text.color"),
        (r"FontWeight\.Bold|fontWeight\s*=", "text.bold"),
        (r"textAlign\s*=\s*TextAlign\.Center", "align.center"),
        (r"textAlign\s*=\s*TextAlign\.(Start|Left)", "align.start"),
        (r"textAlign\s*=\s*TextAlign\.(End|Right)", "align.end"),
        (r"\.alpha\s*\(", "style.alpha"),
    ]
    for pat, sig in compose_attr_patterns:
        if re.search(pat, code):
            attrs.add(sig)

    # Layout relations.
    if re.search(r"\bRow\s*\(", code):
        layout.add("container.horizontal")
    if re.search(r"\bColumn\s*\(", code):
        layout.add("container.vertical")
    if re.search(r"\bBox\s*\(", code):
        layout.add("container.overlay")
    if re.search(r"\b(LazyColumn|LazyRow)\s*\(", code):
        layout.add("container.scroll_or_list")

    if re.search(r"horizontalArrangement\s*=\s*Arrangement\.(Center|SpaceBetween|SpaceAround|SpaceEvenly)", code):
        layout.add("align.center")
    if re.search(r"contentAlignment\s*=\s*Alignment\.[A-Za-z]+End", code):
        layout.add("align.end")
    if re.search(r"contentAlignment\s*=\s*Alignment\.[A-Za-z]+Start", code):
        layout.add("align.start")
    if re.search(r"contentAlignment\s*=\s*Alignment\.[A-Za-z]*Center", code):
        layout.add("align.center")

    return Signatures(structure, attrs, layout)


def extract_swiftui_signatures(swift_path: Path) -> Signatures:
    code = swift_path.read_text(encoding="utf-8", errors="ignore")

    structure: Set[str] = set()
    attrs: Set[str] = set()
    layout: Set[str] = set()

    names = re.findall(r"\b([A-Z][A-Za-z0-9_]*)\s*(?:\(|\{)", code)
    for n in names:
        structure.add(f"node:{normalize_swiftui_name(n)}")

    swift_attr_patterns: List[Tuple[str, str]] = [
        (r"\.frame\s*\([^\)]*maxWidth\s*:\s*\.infinity", "size.fill"),
        (r"\.frame\s*\([^\)]*maxHeight\s*:\s*\.infinity", "size.fill"),
        (r"\.frame\s*\([^\)]*width\s*:", "size.fixed"),
        (r"\.frame\s*\([^\)]*height\s*:", "size.fixed"),
        (r"\.padding\s*\(", "spacing.padding"),
        (r"\.foregroundColor\s*\(", "text.color"),
        (r"\.font\s*\(", "text.size"),
        (r"\.bold\s*\(", "text.bold"),
        (r"\.multilineTextAlignment\s*\(\.center\)", "align.center"),
        (r"\.multilineTextAlignment\s*\(\.(leading|left)\)", "align.start"),
        (r"\.multilineTextAlignment\s*\(\.(trailing|right)\)", "align.end"),
    ]
    for pat, sig in swift_attr_patterns:
        if re.search(pat, code):
            attrs.add(sig)

    if re.search(r"\bHStack\b", code):
        layout.add("container.horizontal")
    if re.search(r"\bVStack\b", code):
        layout.add("container.vertical")
    if re.search(r"\bZStack\b", code):
        layout.add("container.overlay")
    if re.search(r"\b(List|ScrollView)\b", code):
        layout.add("container.scroll_or_list")
    if re.search(r"\.frame\s*\([^\)]*alignment\s*:\s*\.center", code):
        layout.add("align.center")
    if re.search(r"\.frame\s*\([^\)]*alignment\s*:\s*\.(trailing|right)", code):
        layout.add("align.end")
    if re.search(r"\.frame\s*\([^\)]*alignment\s*:\s*\.(leading|left)", code):
        layout.add("align.start")

    return Signatures(structure, attrs, layout)


def score_pair(src: Signatures, tgt: Signatures) -> Dict[str, float]:
    s = jaccard(src.structure, tgt.structure)
    a = jaccard(src.attrs, tgt.attrs)
    l = jaccard(src.layout, tgt.layout)
    psc = (s + a + l) / 3.0
    return {
        "S": round4(s),
        "A": round4(a),
        "L": round4(l),
        "PSC": round4(psc),
    }


def top_diff(src: Set[str], tgt: Set[str], limit: int = 10) -> Dict[str, List[str]]:
    only_src = sorted(src - tgt)[:limit]
    only_tgt = sorted(tgt - src)[:limit]
    return {"only_source": only_src, "only_target": only_tgt}


def main() -> None:
    parser = argparse.ArgumentParser(description="Compute PSC between XML and Compose/SwiftUI files")
    parser.add_argument("--xml", required=True, help="Path to source Android XML")
    parser.add_argument("--compose", help="Path to migrated Compose Kotlin file")
    parser.add_argument("--swiftui", help="Path to migrated SwiftUI file")
    parser.add_argument("--json", action="store_true", help="Print JSON output")
    args = parser.parse_args()

    xml_path = Path(args.xml)
    if not xml_path.exists():
        raise FileNotFoundError(f"XML file not found: {xml_path}")

    if not args.compose and not args.swiftui:
        raise ValueError("At least one target must be provided: --compose or --swiftui")

    src = extract_xml_signatures(xml_path)

    result: Dict[str, object] = {
        "source": str(xml_path),
        "signatures": {
            "xml": {
                "structure_count": len(src.structure),
                "attr_count": len(src.attrs),
                "layout_count": len(src.layout),
            }
        },
        "scores": {},
        "diff_samples": {},
    }

    psc_values: List[float] = []

    if args.compose:
        compose_path = Path(args.compose)
        tgt = extract_compose_signatures(compose_path)
        pair = score_pair(src, tgt)
        result["scores"]["xml_vs_compose"] = pair
        result["signatures"]["compose"] = {
            "structure_count": len(tgt.structure),
            "attr_count": len(tgt.attrs),
            "layout_count": len(tgt.layout),
        }
        result["diff_samples"]["xml_vs_compose"] = {
            "structure": top_diff(src.structure, tgt.structure),
            "attrs": top_diff(src.attrs, tgt.attrs),
            "layout": top_diff(src.layout, tgt.layout),
        }
        psc_values.append(pair["PSC"])

    if args.swiftui:
        swift_path = Path(args.swiftui)
        tgt = extract_swiftui_signatures(swift_path)
        pair = score_pair(src, tgt)
        result["scores"]["xml_vs_swiftui"] = pair
        result["signatures"]["swiftui"] = {
            "structure_count": len(tgt.structure),
            "attr_count": len(tgt.attrs),
            "layout_count": len(tgt.layout),
        }
        result["diff_samples"]["xml_vs_swiftui"] = {
            "structure": top_diff(src.structure, tgt.structure),
            "attrs": top_diff(src.attrs, tgt.attrs),
            "layout": top_diff(src.layout, tgt.layout),
        }
        psc_values.append(pair["PSC"])

    if len(psc_values) == 2:
        result["scores"]["PSC_overall"] = round4(sum(psc_values) / 2.0)

    if args.json:
        print(json.dumps(result, ensure_ascii=False, indent=2))
        return

    print("=== PSC Report ===")
    print(f"Source XML: {xml_path}")
    if "xml_vs_compose" in result["scores"]:
        sc = result["scores"]["xml_vs_compose"]
        print(f"[XML vs Compose] S={sc['S']:.4f}, A={sc['A']:.4f}, L={sc['L']:.4f}, PSC={sc['PSC']:.4f}")
    if "xml_vs_swiftui" in result["scores"]:
        ss = result["scores"]["xml_vs_swiftui"]
        print(f"[XML vs SwiftUI] S={ss['S']:.4f}, A={ss['A']:.4f}, L={ss['L']:.4f}, PSC={ss['PSC']:.4f}")
    if "PSC_overall" in result["scores"]:
        print(f"[Overall] PSC={result['scores']['PSC_overall']:.4f}")


if __name__ == "__main__":
    main()
