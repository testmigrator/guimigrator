import SwiftUI
struct tree_list_item_wrapper: View {

var body: some View {
HStack
{
HStack
{
Image("treeview_collapsed")
}
.frame(minWidth:80,idealWidth:80)
ZStack
{
Text("")
}
}}}

struct tree_list_item_wrapper_Previews: PreviewProvider {
    static var previews: some View {
        tree_list_item_wrapper()
    }
}
