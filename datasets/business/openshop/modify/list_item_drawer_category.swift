import SwiftUI
struct list_item_drawer_category: View {

var body: some View {
ZStack
{
VStack
{
HStack
{
Text("Just arrived")
.frame(minWidth:0,idealWidth:0)
.padding(.top,12)
.padding(.bottom,12)
.padding(.leading,15)
.padding(.trailing,4)
.padding(.leading,15)
.padding(.trailing,4)
.font(.system(size: 20))
Image("arrow_right_black")
.padding(.trailing,12)
.padding(.trailing,12)
.accessibility(label: Text("Populate submenu"))
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,5)
.background(Color.white)
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:2,idealHeight:2)
.background(Color(red:0.87058824,green:0.87058824,blue:0.87058824,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_drawer_category_Previews: PreviewProvider {
    static var previews: some View {
        list_item_drawer_category()
    }
}
