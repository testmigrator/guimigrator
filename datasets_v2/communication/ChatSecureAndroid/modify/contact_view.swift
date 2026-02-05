import SwiftUI
struct contact_view: View {

var body: some View {
ZStack()
{
VStack
{
    ZStack(){}
    ZStack(){}
Image("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(3)
Image("")
.frame(minWidth:24,idealWidth:24,minHeight:24,idealHeight:24)
.padding(.top)
.padding(3)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,62)
.padding(0)
Image("")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.padding(0)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(3)}}

struct contact_view_Previews: PreviewProvider {
    static var previews: some View {
        contact_view()
    }
}
