import SwiftUI
struct collection_quick_actions: View {
    
    var body: some View {
        ZStack
        {
            HStack
            {
                Image("ic_menu_close_clear_cancel")
                    .padding(.leading,15)
            }
        }}}

struct collection_quick_actions_Previews: PreviewProvider {
    static var previews: some View {
        collection_quick_actions()
    }
}
