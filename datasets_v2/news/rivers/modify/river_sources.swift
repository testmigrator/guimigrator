import SwiftUI
struct river_sources: View {

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

struct river_sources_Previews: PreviewProvider {
    static var previews: some View {
        river_sources()
    }
}
