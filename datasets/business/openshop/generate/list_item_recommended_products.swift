import SwiftUI
struct list_item_recommended_products: View {

var body: some View {
VStack
{
ZStack()
{}
.frame(minHeight:0,idealHeight:0)
ZStack
{
Text("Product Name")
.padding(.top,1)
.font(.system(size: 12))
.lineLimit(1)
.truncationMode(.tail)
List
{
HStack
{
Text("150 USD")
.padding(.leading,3)
.padding(.trailing,3)
.font(.system(size: 10))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.lineLimit(1)
.truncationMode(.tail)
Text("149 USD")
.padding(.leading,3)
.padding(.trailing,3)
.bold()
.font(.system(size: 10))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
}
.padding(.top,3)
.padding(.bottom,3)
}
.padding(2)
}
.frame(minHeight:0,maxHeight:.infinity)
.padding(.bottom,8)}}

struct list_item_recommended_products_Previews: PreviewProvider {
    static var previews: some View {
        list_item_recommended_products()
    }
}
