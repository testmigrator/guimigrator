import SwiftUI
struct list_item_orders_history: View {

var body: some View {
HStack
{
Text("125364")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
Text("2.8.1992")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
Text("1580 USD")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 14))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(4)}}

struct list_item_orders_history_Previews: PreviewProvider {
    static var previews: some View {
        list_item_orders_history()
    }
}
