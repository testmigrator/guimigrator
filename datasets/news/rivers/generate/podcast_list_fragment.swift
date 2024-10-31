import SwiftUI
struct podcast_list_fragment: View {

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

struct podcast_list_fragment_Previews: PreviewProvider {
    static var previews: some View {
        podcast_list_fragment()
    }
}
