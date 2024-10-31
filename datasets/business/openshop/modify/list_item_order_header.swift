import SwiftUI
struct list_item_order_header: View {

var body: some View {
VStack
{
Text("Order details")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
HStack
{
Text("Order:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
HStack
{
Text("Name:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("Date created:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("Total:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("Shipping type:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("Shipping price:")
.font(.system(size: 13))
Text("")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)}}

struct list_item_order_header_Previews: PreviewProvider {
    static var previews: some View {
        list_item_order_header()
    }
}
