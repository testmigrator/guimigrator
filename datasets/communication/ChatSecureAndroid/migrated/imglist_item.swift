
import SwiftUI
struct imglist_item: View {
var body: some View {
HStack
{
Image("shape_separator")
.padding(.top,3)
.padding(.bottom,3)
.hidden()
Image("")
.padding(.leading,4)
.padding(.trailing,4)
Text("")
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}}}

struct imglist_item_Previews: PreviewProvider {
    static var previews: some View {
        imglist_item()
    }
}
