import SwiftUI
struct main_collection_quick_actions: View {

var body: some View {
ZStack
{
HStack
{
Image("ic_menu_close_clear_cancel")
Image("ic_menu_edit")
.padding(.leading,15)
}
}}}

struct main_collection_quick_actions_Previews: PreviewProvider {
    static var previews: some View {
        main_collection_quick_actions()
    }
}
