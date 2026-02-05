import SwiftUI
struct message_view_left: View {

var body: some View {
Rectangle()
{
VStack
{
Rectangle()
.padding(.leading,24)
.padding(6)
Image("")
.hidden()
Text("")
.padding(.bottom,1)
.padding(.leading,24)
.padding(6)
.font(.system(size: 10))
}
.padding(.leading,24)
.padding(.trailing,36)
.padding(0)
.padding(.leading,16)
.background(Image("message_view_rounded_light").resizable())
Image("")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.padding(0)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(6)
.padding(3)}}

struct message_view_left_Previews: PreviewProvider {
    static var previews: some View {
        message_view_left()
    }
}
