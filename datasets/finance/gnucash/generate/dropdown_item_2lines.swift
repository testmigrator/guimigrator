import SwiftUI
struct dropdown_item_2lines: View {

var body: some View {
VStack
{
Text("Transaction description")
.truncationMode(.tail)
Text("Amount and date")
.truncationMode(.tail)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,5)
.padding(.leading,10)
.padding(.trailing,10)}}

struct dropdown_item_2lines_Previews: PreviewProvider {
    static var previews: some View {
        dropdown_item_2lines()
    }
}
