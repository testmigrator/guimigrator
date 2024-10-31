import SwiftUI
struct list_item_cart_discount: View {

var body: some View {
HStack
{
Text("Discount 1500 USD. Buy something more. Pleaseee")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 15))
Text("1500 USD")
.padding(6)
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
Image("delete")
.background(Color.white)
.padding(.trailing,6)
.padding(9)
.accessibility(label: Text("Delete"))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)}}

struct list_item_cart_discount_Previews: PreviewProvider {
    static var previews: some View {
        list_item_cart_discount()
    }
}
