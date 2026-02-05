import SwiftUI
struct activity_main_drawer_left: View {

var body: some View {
VStack
{
ZStack
{
Image("drawer_left_header")
.frame(minWidth:0,maxWidth:.infinity)
Rectangle()
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(.top,35)
.padding(.leading,20)
.padding(.leading,20)
Text("激荡的天石")
.padding(.bottom,20)
.padding(.leading,20)
.padding(.leading,20)
.font(.system(size: 15))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:160,idealHeight:160)
List
{
ForEach(1..<10)
{
index in
activity_main_drawer_left_list_item(index: index)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.listStyle(PlainListStyle())
.padding(.top,8)
VStack
{
Rectangle()
.fill(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
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
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.alignmentGuide(.leading) { _ in 0 }
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct activity_main_drawer_left_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_drawer_left()
    }
}
