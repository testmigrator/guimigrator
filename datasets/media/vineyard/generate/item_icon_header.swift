import SwiftUI
struct item_icon_header: View {

var body: some View {
HStack
{
Image("")
.frame(minWidth:32,idealWidth:32,minHeight:32,idealHeight:32)
Text("")
.padding(.top,3)
.padding(.leading,6)
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct item_icon_header_Previews: PreviewProvider {
    static var previews: some View {
        item_icon_header()
    }
}
