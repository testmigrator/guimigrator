import SwiftUI
struct lb_video_card_view: View {

var body: some View {
ZStack()//update
{
Rectangle()
HStack
{
ZStack
{
Text("")
.padding(.top,2)
.padding(.leading,2)
.font(.system(size: 16))
.lineLimit(1)
.truncationMode(.tail)
Text("")
.padding(.bottom,2)
.padding(.leading,2)
.font(.system(size: 12))
.lineLimit(1)
HStack
{
Image("")
.frame(minHeight:16,idealHeight:16)
.accessibility(label: Text("@null"))
.scaledToFit()
.hidden()
Image("")
.frame(minWidth:16,idealWidth:16,minHeight:16,idealHeight:16)
.accessibility(label: Text("@null"))
.scaledToFit()
.hidden()
}
}
.frame(minHeight:52,idealHeight:52)
.padding(6)
}
}}}

struct lb_video_card_view_Previews: PreviewProvider {
    static var previews: some View {
        lb_video_card_view()
    }
}
