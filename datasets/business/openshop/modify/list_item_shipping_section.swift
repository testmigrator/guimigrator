import SwiftUI
struct list_item_shipping_section: View {

var body: some View {
ZStack
{
Text("Personal pickup")
.padding(.top,24)
.padding(.bottom,2)
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,8)
.padding(.trailing,8)}}

struct list_item_shipping_section_Previews: PreviewProvider {
    static var previews: some View {
        list_item_shipping_section()
    }
}
