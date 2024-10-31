import SwiftUI
struct fragment_order: View {

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
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_order_Previews: PreviewProvider {
    static var previews: some View {
        fragment_order()
    }
}
