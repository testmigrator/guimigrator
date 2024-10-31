import SwiftUI
struct list_item_shops: View {

var body: some View {
HStack
{
Image("")
.frame(minHeight:35,idealHeight:35)
.padding(.top,10)
.padding(.bottom,10)
.padding(.leading,5)
.padding(.trailing,5)
.scaledToFit()
Text("")
.padding(5)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_shops_Previews: PreviewProvider {
    static var previews: some View {
        list_item_shops()
    }
}
