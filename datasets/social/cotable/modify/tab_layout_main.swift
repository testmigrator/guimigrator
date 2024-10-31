import SwiftUI
struct tab_layout_main: View {

var body: some View {
HStack
{
ZStack
{
Text("")
.font(.system(size: 15))
.foregroundColor(Color(red:0.20784314,green:0.20784314,blue:0.20784314,opacity:1.0))
}
Image("tab_notification_bg")
.accessibility(label: Text("@null"))
.hidden()
Text("")
.font(.system(size: 12))
.foregroundColor(Color(.gray))
.hidden()
.background(Image("tab_notification_bg").resizable())
}
.background(Image("tab_strip_background").resizable())}}

struct tab_layout_main_Previews: PreviewProvider {
    static var previews: some View {
        tab_layout_main()
    }
}
