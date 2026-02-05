import SwiftUI
struct list_item_2_lines: View {

var body: some View {
ZStack
{
VStack
{
Text("Primary text")
.truncationMode(.tail)
Text("Secondary text")
.truncationMode(.middle)
}
}
.frame(minWidth:0,idealWidth:0)}}

struct list_item_2_lines_Previews: PreviewProvider {
    static var previews: some View {
        list_item_2_lines()
    }
}
