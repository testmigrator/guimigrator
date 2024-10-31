import SwiftUI
struct refresh_icon: View {

var body: some View {
ZStack
{
ProgressView()
.frame(minWidth:32,idealWidth:32,minHeight:32,idealHeight:32)
}
.padding(.leading,12)
.padding(.trailing,12)}}

struct refresh_icon_Previews: PreviewProvider {
    static var previews: some View {
        refresh_icon()
    }
}
