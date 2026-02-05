import SwiftUI
struct fragment_scheduled_events_list: View {

var body: some View {
VStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
Text("No recurring transactions to display.")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_scheduled_events_list_Previews: PreviewProvider {
    static var previews: some View {
        fragment_scheduled_events_list()
    }
}
