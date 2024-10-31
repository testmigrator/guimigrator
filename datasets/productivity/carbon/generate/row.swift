import SwiftUI
struct row: View {

var body: some View {
Rectangle()
.fill(Image("list_item_selector").resizable())
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,15)}}

struct row_Previews: PreviewProvider {
    static var previews: some View {
        row()
    }
}
