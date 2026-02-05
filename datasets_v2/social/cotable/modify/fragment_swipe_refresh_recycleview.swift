import SwiftUI
struct fragment_swipe_refresh_recycleview: View {

var body: some View {
ZStack
{
HStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.padding(25)
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.6039216,green:0.6039216,blue:0.6039216,opacity:1.0))}}

struct fragment_swipe_refresh_recycleview_Previews: PreviewProvider {
    static var previews: some View {
        fragment_swipe_refresh_recycleview()
    }
}
