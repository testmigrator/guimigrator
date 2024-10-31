import SwiftUI
struct main_list_item_loadmore: View {

var body: some View {
ZStack
{
Text("More")
.bold()
.font(.system(size: 24))
.foregroundColor(Color(red:1.0,green:0.92941177,blue:0.85882354,opacity:1.0))
Image("loadmore")
.opacity(0.0)
}
.background(Color(red:0.7647059,green:0.70980394,blue:0.654902,opacity:1.0))}}

struct main_list_item_loadmore_Previews: PreviewProvider {
    static var previews: some View {
        main_list_item_loadmore()
    }
}
