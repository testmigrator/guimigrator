import SwiftUI
struct view_loading_card: View {

var body: some View {
ZStack
{
ProgressView()
.padding(36)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct view_loading_card_Previews: PreviewProvider {
    static var previews: some View {
        view_loading_card()
    }
}
