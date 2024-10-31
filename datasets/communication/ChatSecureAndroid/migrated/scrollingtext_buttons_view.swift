
import SwiftUI
struct scrollingtext_buttons_view: View {
var body: some View {
VStack
{
Text("TITLE")
.font(.system(size: 14))
List
{
HStack
{
ScrollView
{
Text("this is sample text this is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample text")
.padding(6)
.font(.system(size: 11))
}
}
HStack
{
Button(action: {})
{
Text("button1")
.foregroundColor(.black)
}
.background(Color.blue)
Button(action: {})
{
Text("button2")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minHeight:30,idealHeight:30)
}
}
.padding(6)}}

struct scrollingtext_buttons_view_Previews: PreviewProvider {
    static var previews: some View {
        scrollingtext_buttons_view()
    }
}
