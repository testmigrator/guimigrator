import SwiftUI
struct action_icon_shopping_cart: View {

var body: some View {
ZStack
{
VStack
{
HStack
{
Spacer()
Text("")
.padding(.bottom,2)
.padding(.leading,5)
.padding(.trailing,5)
.font(.system(size: 12))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
.opacity(1.0)
.background(Image("badge_oval").resizable())
}
Image("ic_shopping_cart_white_24dp")
.padding(.top,0)
.padding(.bottom,0)
.padding(.leading,0)
.padding(.trailing,0)
.padding(3)
.accessibility(label: Text("Shopping cart"))
}
}
.frame(minHeight:0,maxHeight:.infinity)}}

struct action_icon_shopping_cart_Previews: PreviewProvider {
    static var previews: some View {
        action_icon_shopping_cart()
    }
}
