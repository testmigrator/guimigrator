import SwiftUI
struct state_detail_layout: View {

var body: some View {
ZStack
{
Image("rsz_scroll_new")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
VStack
{
Text("New Text")
.padding(.top,140)
.padding(.leading,70)
.bold()
.font(.system(size: 40))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
Text("New Text")
.padding(.top,20)
.padding(.leading,70)
.font(.system(size: 17))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}
Text("New Text")
.padding(.top,10)
.font(.system(size: 17))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color.black)}}

struct state_detail_layout_Previews: PreviewProvider {
    static var previews: some View {
        state_detail_layout()
    }
}
