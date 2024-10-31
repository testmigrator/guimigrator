import SwiftUI
struct status_bar_container: View {

var body: some View {
HStack
{
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:38,idealHeight:38)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.trailing,5)
.background(Color.black)}}

struct status_bar_container_Previews: PreviewProvider {
    static var previews: some View {
        status_bar_container()
    }
}
