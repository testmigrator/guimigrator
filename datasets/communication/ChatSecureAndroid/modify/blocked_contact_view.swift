import SwiftUI
struct blocked_contact_view: View {

var body: some View {
ZStack()
{
ZStack
{
Image("")
.padding(2)
.scaledToFit()
Image("ic_im_block")
}
.frame(minWidth:60,idealWidth:60,minHeight:60,idealHeight:60)
VStack
{
Text("")
.lineLimit(1)
Text("")
.lineLimit(1)
}
.padding(.leading,9)
}
.padding(.leading,9)
.padding(.trailing,9)}}

struct blocked_contact_view_Previews: PreviewProvider {
    static var previews: some View {
        blocked_contact_view()
    }
}
