
import SwiftUI
struct chat_switcher_item: View {
var body: some View {
ZStack
{
null
VStack
{
Image("im_avatar_picture_border_normal","")
.frame(minWidth:58,idealWidth:58,minHeight:58,idealHeight:58)
.padding(.top,5)
.padding(.leading,4)
Text("")
.padding(.top,3)
.padding(.leading,7)
.font(.system(size: 14))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.lineLimit(1)
.truncationMode(.tail)
}
Text("")
.padding(.leading,7)
.font(.system(size: 11))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.lineLimit(1)
.truncationMode(.tail)
Text("")
.padding(.leading,7)
.font(.system(size: 11))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.lineLimit(1)
}
.frame(minWidth:92,idealWidth:92)
.background(Image("dashboard_highlight").resizable())}}

struct chat_switcher_item_Previews: PreviewProvider {
    static var previews: some View {
        chat_switcher_item()
    }
}
