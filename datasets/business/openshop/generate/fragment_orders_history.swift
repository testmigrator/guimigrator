import SwiftUI
struct fragment_orders_history: View {

var body: some View {
VStack
{
Text("Your order history is empty")
.hidden()
VStack
{
HStack
{
Text("Order")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
Text("Date created")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
Text("Total price")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
.background(Color(red:0.7058824,green:0.7058824,blue:0.7058824,opacity:1.0))
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
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct fragment_orders_history_Previews: PreviewProvider {
    static var previews: some View {
        fragment_orders_history()
    }
}
