import SwiftUI
struct trash_view: View {

var body: some View {
Image("trash")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,10)
.accessibility(label: Text("@null"))}}

struct trash_view_Previews: PreviewProvider {
    static var previews: some View {
        trash_view()
    }
}
