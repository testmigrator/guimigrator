import SwiftUI
struct action_bar_center_title_gray: View {

var body: some View {
ZStack
{
Text("HN")
.font(.system(size: 24))
.foregroundColor(Color(red:0.4745098,green:0.4745098,blue:0.4745098,opacity:1.0))
}
.frame(minHeight:0,maxHeight:.infinity)}}

struct action_bar_center_title_gray_Previews: PreviewProvider {
    static var previews: some View {
        action_bar_center_title_gray()
    }
}
