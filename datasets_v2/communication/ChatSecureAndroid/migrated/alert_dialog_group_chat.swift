
import SwiftUI
struct alert_dialog_group_chat: View {
var body: some View {
VStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.leading,20)
.padding(.trailing,20)
TextField("nickname to use in room", text: .constant(""))
.padding(.leading,20)
.padding(.trailing,20)
TextField("name of room to create or join"", text: .constant(""))
.padding(.leading,20)
.padding(.trailing,20)
TextField("groupchat server (conference.foo.com)", text: .constant(""))
.padding(.leading,20)
.padding(.trailing,20)
}}}

struct alert_dialog_group_chat_Previews: PreviewProvider {
    static var previews: some View {
        alert_dialog_group_chat()
    }
}
