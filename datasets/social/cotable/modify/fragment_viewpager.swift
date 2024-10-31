import SwiftUI
struct fragment_viewpager: View {

var body: some View {
ZStack
{
VStack
{
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.frame(minHeight:40,idealHeight:40)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_viewpager_Previews: PreviewProvider {
    static var previews: some View {
        fragment_viewpager()
    }
}
