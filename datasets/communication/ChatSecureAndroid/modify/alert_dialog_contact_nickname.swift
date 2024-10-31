import SwiftUI
struct alert_dialog_contact_nickname: View {

var body: some View {
VStack
{
Text("")
.padding(.leading,8)
.padding(.trailing,8)
TextField("Nickname", text: .constant(""))
.padding(.leading,8)
.padding(.trailing,8)
}}}

struct alert_dialog_contact_nickname_Previews: PreviewProvider {
    static var previews: some View {
        alert_dialog_contact_nickname()
    }
}
