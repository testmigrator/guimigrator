import SwiftUI
struct activity_main_drawer_left_divider: View {

var body: some View {
VStack
{
Rectangle()
.fill(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_main_drawer_left_divider_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_drawer_left_divider()
    }
}
