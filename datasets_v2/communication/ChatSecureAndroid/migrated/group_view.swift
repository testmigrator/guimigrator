
import SwiftUI
struct group_view: View {
var body: some View {
HStack
{
Text("")
.frame(minWidth:0,idealWidth:0)
.lineLimit(1)
Text("")
.padding(.trailing,10)
.lineLimit(1)
}
.padding(.leading)}}

struct group_view_Previews: PreviewProvider {
    static var previews: some View {
        group_view()
    }
}
