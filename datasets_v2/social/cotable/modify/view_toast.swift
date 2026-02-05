import SwiftUI
struct view_toast: View {

var body: some View {
VStack
{
ZStack
{
HStack
{
Image("")
.frame(minHeight:20,idealHeight:20)
.padding(.trailing,8)
.scaledToFit()
.hidden()
Text("TOAST MESSAGE")
.font(.system(size: 16))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
}
.padding(.top,8)
.padding(.bottom,8)
.padding(.leading,10)
.padding(.trailing,10)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:0.12941177,green:0.5882353,blue:0.9529412,opacity:1.0))}}

struct view_toast_Previews: PreviewProvider {
    static var previews: some View {
        view_toast()
    }
}
