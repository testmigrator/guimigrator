#!/usr/bin/env python3
import argparse
import os
import re
import shutil
from pathlib import Path

REPO_ROOT = Path(__file__).resolve().parents[1]
TASK_PROPERTIES = REPO_ROOT / "src" / "main" / "resources" / "task.properties"
OUTPUT_DIR = REPO_ROOT / "output" / "targetUICode"
DATASETS_V2 = REPO_ROOT / "datasets_v2"


def read_task_properties(path: Path) -> dict:
    props = {}
    for raw in path.read_text(encoding="utf-8").splitlines():
        line = raw.strip()
        if not line or line.startswith("#"):
            continue
        if "=" not in line:
            continue
        k, v = line.split("=", 1)
        props[k.strip()] = v.strip()
    return props


def slug(s: str) -> str:
    return re.sub(r"[^a-z0-9]+", "", s.lower())


def derive_category_project(resource_path: str) -> tuple[str, str]:
    parts = Path(resource_path).parts
    if "guimigration_datasets" in parts:
        i = parts.index("guimigration_datasets")
        if i + 2 < len(parts):
            return parts[i + 1], parts[i + 2]
    # fallback: try to detect .../datasets/<category>/<project>
    for i, p in enumerate(parts):
        if p.lower().startswith("dataset") and i + 2 < len(parts):
            return parts[i + 1], parts[i + 2]
    return "", ""


def resolve_project_dir(category: str, project_raw: str) -> Path:
    cat_dir = DATASETS_V2 / category
    if not cat_dir.exists():
        raise FileNotFoundError(f"Category not found in datasets_v2: {cat_dir}")

    project_dirs = [p for p in cat_dir.iterdir() if p.is_dir()]
    # direct match
    for p in project_dirs:
        if p.name == project_raw:
            return p

    # normalize
    raw_norm = slug(project_raw.replace("show_", "").replace("show-", "").replace("show", ""))
    candidates = []
    for p in project_dirs:
        if slug(p.name) == raw_norm:
            candidates.append(p)
    if len(candidates) == 1:
        return candidates[0]

    # partial match
    for p in project_dirs:
        if raw_norm and raw_norm in slug(p.name):
            candidates.append(p)
    candidates = list(dict.fromkeys(candidates))
    if len(candidates) == 1:
        return candidates[0]

    names = ", ".join(sorted([p.name for p in project_dirs]))
    raise ValueError(
        f"Cannot resolve project dir for '{project_raw}' in category '{category}'. "
        f"Available: {names}"
    )


def copy_outputs(dst: Path, dry_run: bool) -> None:
    if not OUTPUT_DIR.exists():
        raise FileNotFoundError(f"Output directory not found: {OUTPUT_DIR}")
    dst.mkdir(parents=True, exist_ok=True)

    if dry_run:
        print(f"[dry-run] Would clear: {dst}")
    else:
        for p in dst.iterdir():
            if p.is_file():
                p.unlink()

    for src in OUTPUT_DIR.iterdir():
        if not src.is_file():
            continue
        if dry_run:
            print(f"[dry-run] Would copy: {src.name} -> {dst}")
        else:
            shutil.copy2(src, dst / src.name)


def main() -> int:
    parser = argparse.ArgumentParser(description="Collect GUIMigrator outputs into datasets_v2.")
    parser.add_argument("--task", default=str(TASK_PROPERTIES), help="Path to task.properties")
    parser.add_argument("--dry-run", action="store_true", help="Show actions without copying")
    args = parser.parse_args()

    task_path = Path(args.task)
    props = read_task_properties(task_path)
    resource_path = props.get("resourcePath", "").strip()
    target_platform = props.get("targetPlatform", "").strip().lower()

    if not resource_path:
        raise ValueError("resourcePath is empty in task.properties")
    if target_platform not in {"compose", "swiftui"}:
        raise ValueError(f"targetPlatform must be COMPOSE or SWIFTUI, got: {target_platform}")

    category, project_raw = derive_category_project(resource_path)
    if not category or not project_raw:
        raise ValueError(f"Failed to derive category/project from resourcePath: {resource_path}")

    project_dir = resolve_project_dir(category, project_raw)
    dst = project_dir / target_platform

    print(f"Resource path: {resource_path}")
    print(f"Resolved: category='{category}', project='{project_dir.name}', platform='{target_platform}'")
    print(f"Output dir: {OUTPUT_DIR}")
    print(f"Destination: {dst}")

    copy_outputs(dst, args.dry_run)
    print("Done.")
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
