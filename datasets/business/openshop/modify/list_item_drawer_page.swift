import SwiftUI
struct list_item_drawer_page: View {

var body: some View {
ZStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,12)
.padding(.bottom,12)
.padding(.leading,15)
.padding(.trailing,4)
.padding(.leading,15)
.padding(.trailing,4)
.font(.system(size: 18))
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity)
.background(Image("ripple_selector_transparent").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:0.7058824,green:0.7058824,blue:0.7058824,opacity:1.0))}}

struct list_item_drawer_page_Previews: PreviewProvider {
    static var previews: some View {
        list_item_drawer_page()
    }
}
