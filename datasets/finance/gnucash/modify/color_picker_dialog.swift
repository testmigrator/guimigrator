import SwiftUI
struct color_picker_dialog: View {
    
    var body: some View {
        ScrollView
        {
            ZStack
            {
                ProgressView()
                Rectangle()
            }
            .padding(28)
        }}}

struct color_picker_dialog_Previews: PreviewProvider {
    static var previews: some View {
        color_picker_dialog()
    }
}
