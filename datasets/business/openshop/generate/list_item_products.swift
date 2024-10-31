import SwiftUI
struct list_item_products: View {

var body: some View {
VStack
{
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity)
ZStack
{
Text("Kotnickove ponozky s krajkou")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 14))
.lineLimit(2)
.truncationMode(.tail)
List
{
HStack
{
Text("150 USD")
.padding(.leading,4)
.padding(.trailing,4)
.font(.system(size: 12))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.lineLimit(1)
.truncationMode(.tail)
Text("149 USD")
.padding(.leading,4)
.padding(.trailing,4)
.bold()
.font(.system(size: 12))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
}
.padding(.top,3)
.padding(.bottom,3)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(3)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_products_Previews: PreviewProvider {
    static var previews: some View {
        list_item_products()
    }
}
