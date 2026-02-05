import SwiftUI
struct view_error_layout: View {

var body: some View {
ZStack
{
ZStack
{
VStack
{
ZStack
{
Image("pagefailed_bg")
//.background("pagefailed_bg")
.hidden()
ProgressView()
.frame(minWidth:79,idealWidth:79,minHeight:79,idealHeight:79)
}
Text("点击屏幕, 重新加载")
.padding(.top,10)
.font(.system(size: 16))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct view_error_layout_Previews: PreviewProvider {
    static var previews: some View {
        view_error_layout()
    }
}
