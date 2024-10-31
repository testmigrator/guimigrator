import SwiftUI
struct image_view_activity: View {

var body: some View {
ZStack
{
Image("broken_image_large")
.opacity(0.0)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.2,green:0.2,blue:0.2,opacity:1.0))}}

struct image_view_activity_Previews: PreviewProvider {
    static var previews: some View {
        image_view_activity()
    }
}
