import SwiftUI
struct chat_list_view: View {

var body: some View {
ZStack()
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.0))
Text("No conversations.nnTap here to start one!")
.font(.system(size: 24))
}}}

struct chat_list_view_Previews: PreviewProvider {
    static var previews: some View {
        chat_list_view()
    }
}
