import SwiftUI
struct rss_list_fragment: View {

var body: some View {
VStack
{
Text("")
.padding(5)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
}}}

struct rss_list_fragment_Previews: PreviewProvider {
    static var previews: some View {
        rss_list_fragment()
    }
}
