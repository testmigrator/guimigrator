import SwiftUI
struct drawer_header: View {

var body: some View {
VStack
{
VStack
{
Image("ic_launcher")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.scaledToFit()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(13)
.background(Color.white)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct drawer_header_Previews: PreviewProvider {
    static var previews: some View {
        drawer_header()
    }
}
