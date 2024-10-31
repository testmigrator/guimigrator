import SwiftUI
struct river: View {

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

struct river_Previews: PreviewProvider {
    static var previews: some View {
        river()
    }
}
