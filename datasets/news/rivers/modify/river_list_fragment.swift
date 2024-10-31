import SwiftUI
struct river_list_fragment: View {

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

struct river_list_fragment_Previews: PreviewProvider {
    static var previews: some View {
        river_list_fragment()
    }
}
