import SwiftUI
struct list_item_shipping: View {

var body: some View {
VStack
{
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
.background(Color(red:0.654902,green:0.654902,blue:0.654902,opacity:0.84313726))
HStack
{
ZStack()
{}
.frame(minWidth:4,idealWidth:4)
.background(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
ZStack()
{}
.frame(minWidth:4,idealWidth:4)
VStack
{
Text("USPS Express Mail")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 15))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Small Text")
.frame(minWidth:0,idealWidth:0)
.padding(.top,1)
.padding(.bottom,1)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Free")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 12))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
.padding(.top,4)
.padding(.bottom,4)
ZStack()
{}
.frame(minWidth:8,idealWidth:8)
Image("branch_detail")
.background(Color.white)
.padding(10)
.accessibility(label: Text("Shipping info"))
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_shipping_Previews: PreviewProvider {
    static var previews: some View {
        list_item_shipping()
    }
}
