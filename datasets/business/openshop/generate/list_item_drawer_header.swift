import SwiftUI
struct list_item_drawer_header: View {

var body: some View {
ZStack
{
Image("drawer_background")
VStack
{
Image("user")
Text("Unknown user")
.padding(.top,8)
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(20)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_drawer_header_Previews: PreviewProvider {
    static var previews: some View {
        list_item_drawer_header()
    }
}
