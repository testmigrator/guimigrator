import SwiftUI
struct chat_switcher_dialog: View {

var body: some View {
ZStack
{
ZStack()
{
HStack
{
Text("")
}
}
Text("No active chats.")
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.hidden()
Image("droid_watermark")
.scaledToFill()
}
.frame(minHeight:112,idealHeight:112)}}

struct chat_switcher_dialog_Previews: PreviewProvider {
    static var previews: some View {
        chat_switcher_dialog()
    }
}
