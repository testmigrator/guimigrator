import SwiftUI
struct message_view_right: View {

var body: some View {
    ZStack()
{
VStack
{
Rectangle()
.padding(6)
Image("")
.hidden()
Text("")
.frame(minWidth:160,idealWidth:160)
.padding(6)
.font(.system(size: 10))
}
.background(Image("message_view_rounded_light").resizable())
Image("")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.padding(.trailing,0)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(6)
.padding(3)}}

struct message_view_right_Previews: PreviewProvider {
    static var previews: some View {
        message_view_right()
    }
}
