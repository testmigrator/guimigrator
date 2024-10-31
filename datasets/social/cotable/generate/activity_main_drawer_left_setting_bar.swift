import SwiftUI
struct activity_main_drawer_left_setting_bar: View {

var body: some View {
HStack
{
ZStack
{
VStack
{
Image("btn_menu_options_normal")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
.scaledToFit()
Text("Settings")
.padding(.top,6)
.font(.system(size: 10))
.foregroundColor(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
}
}
.padding(8)
.background(Image("list_cell_background_selector").resizable())
ZStack
{
VStack
{
Image("btn_menu_about_normal")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
Text("About")
.padding(.top,6)
.font(.system(size: 10))
.foregroundColor(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
}
}
.padding(8)
.background(Image("list_cell_background_selector").resizable())
ZStack
{
VStack
{
Image("btn_menu_close_normal")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
Text("Exit")
.padding(.top,6)
.font(.system(size: 10))
.foregroundColor(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
}
}
.padding(8)
.background(Image("list_cell_background_selector").resizable())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_main_drawer_left_setting_bar_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_drawer_left_setting_bar()
    }
}
