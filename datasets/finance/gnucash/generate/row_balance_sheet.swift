import SwiftUI
struct row_balance_sheet: View {

var body: some View {
HStack
{
Text("Credit Card")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
Text("$ 2,500")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
}}}

struct row_balance_sheet_Previews: PreviewProvider {
    static var previews: some View {
        row_balance_sheet()
    }
}
