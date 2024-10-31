import SwiftUI
struct list_item_cart_product: View {

var body: some View {
HStack
{
ZStack
{
ZStack()
{}
.frame(minWidth:0,idealWidth:0)
}
.frame(minWidth:0,idealWidth:0)
HStack
{
VStack
{
Text("Product name")
.padding(.bottom,4)
.font(.system(size: 15))
.lineLimit(2)
Text("1500 USD")
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
.lineLimit(1)
Text("15 pcs")
.font(.system(size: 14))
.lineLimit(1)
Text("Some product info")
.padding(.top,4)
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
.lineLimit(2)
}
.frame(minWidth:0,idealWidth:0)
.padding(.leading,8)
.padding(.trailing,8)
VStack
{
Text("Delete")
.overlay(Image("delete")
.padding(3))
.padding(6)
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
.background(Color.white)
Text("Edit")
.overlay(Image("update")
.padding(3))
.padding(6)
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
.background(Color.white)
}
.padding(.leading,8)
.padding(.trailing,8)
}
.frame(minWidth:0,idealWidth:0)
}
.padding(.top,8)
.padding(.bottom,8)}}

struct list_item_cart_product_Previews: PreviewProvider {
    static var previews: some View {
        list_item_cart_product()
    }
}
