import SwiftUI
struct fragment_cart: View {

var body: some View {
VStack
{
VStack
{
Image("cart_empty")
.accessibility(label: Text("Your cart is empty"))
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:20,idealHeight:20)
Text("Your cart is empty")
Text("START SHOPPING")
.padding(16)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.hidden()
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.listStyle(PlainListStyle())
VStack
{
HStack
{
VStack
{
Text("Do you have a discount code?")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,5)
.font(.system(size: 16))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
.alignmentGuide(.trailing) { _ in 0 }

Text("3 pcs total")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 14))
}
.frame(minWidth:0,idealWidth:0)
ZStack()
{}
.frame(minWidth:8,idealWidth:8)
VStack
{
Text("9995 USD")
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("inc. VAT")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 13))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.padding(.top,3)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,4)
.padding(.leading,8)
.padding(.trailing,8)
Button(action: {})
{
Text("SHIPPING and PAYMENT")
.foregroundColor(.white)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.pink)
}
.frame(minWidth:0,maxWidth:.infinity)
.opacity(1.0)
.background(Color(red:0.93333334,green:0.93333334,blue:0.93333334,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_cart_Previews: PreviewProvider {
    static var previews: some View {
        fragment_cart()
    }
}
