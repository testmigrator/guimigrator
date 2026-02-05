import SwiftUI
struct activity_main_drawer_left_list_item: View {

var body: some View {
HStack
{
Rectangle()
.frame(minHeight:48,idealHeight:48)
.padding(.leading,24)
.padding(.leading,24)
Text("About")
.frame(minHeight:48,idealHeight:48)
.padding(.leading,42)
.padding(.trailing,16)
.padding(.leading,42)
.padding(.trailing,16)
.font(.system(size: 16))
.foregroundColor(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:48,idealHeight:48)
.background(Image("list_cell_background_selector").resizable())}}

struct activity_main_drawer_left_list_item_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_drawer_left_list_item()
    }
}
