package ir;

public enum SlotKey {
    /**
     * 容器类组件的子节点（Column/Row/Stack...）
     */
    CONTENT,
    DRAWER_CONTENT,   // 左侧抽屉
    MAIN_CONTENT,      // 主内容

    /**
     * Button 等组件的 label slot
     */
    LABEL,

    /**
     * 可选：图标 slot（后面扩展用）
     */
    ICON
}
