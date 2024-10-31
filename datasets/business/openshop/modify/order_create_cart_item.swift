import SwiftUI
struct order_create_cart_item: View {

var body: some View {
VStack
{
HStack
{
VStack
{
Text("Big socks with turtles")
.frame(minHeight:0,maxHeight:.infinity)
.padding(.top,2)
.padding(.bottom,2)
.font(.system(size: 15))
.lineLimit(1)
.truncationMode(.tail)
ZStack
{
HStack
{
Text("Some product info")
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
.lineLimit(1)
.truncationMode(.tail)
Text("15 pcs")
.padding(.leading,4)
.padding(.trailing,4)
.font(.system(size: 14))
.lineLimit(1)
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,4)
}
.frame(minWidth:0,idealWidth:0)
ZStack()
{}
.frame(minWidth:12,idealWidth:12)
Text("12 USD")
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
ZStack()
{}
.frame(minHeight:1,idealHeight:1)
.background(Color.white)
.padding(.top,4)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,4)
.padding(.bottom,4)}}

struct order_create_cart_item_Previews: PreviewProvider {
    static var previews: some View {
        order_create_cart_item()
    }
}
