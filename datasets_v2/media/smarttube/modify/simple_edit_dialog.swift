import SwiftUI
struct simple_edit_dialog: View {

var body: some View {
VStack
{
TextField("Enter value", text: .constant(""))
}
.padding(10)}}

struct simple_edit_dialog_Previews: PreviewProvider {
    static var previews: some View {
        simple_edit_dialog()
    }
}
