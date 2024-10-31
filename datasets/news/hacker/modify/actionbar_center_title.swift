import SwiftUI
struct actionbar_center_title: View {

var body: some View {
ZStack
{
Text("HN")
.font(.system(size: 24))
.foregroundColor(Color(.gray))
}
.frame(minHeight:0,maxHeight:.infinity)}}

struct actionbar_center_title_Previews: PreviewProvider {
    static var previews: some View {
        actionbar_center_title()
    }
}
