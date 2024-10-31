import SwiftUI
struct fragment_blog_detail: View {

var body: some View {
VStack
{
ZStack
{
Rectangle()
{
VStack
{
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
VStack
{
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(8)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(8)
}
.padding(.bottom,55)
.padding(.trailing,8)
ZStack
{
Rectangle()
.fill(Color(red:0.9137255,green:0.9372549,blue:0.9529412,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
HStack
{
ZStack
{
Image("ic_reply")
}
.frame(minWidth:0,idealWidth:0)
ZStack
{
HStack
{
Image("ic_dianzan")
Text("45")
}
}
.frame(minWidth:0,idealWidth:0)
ZStack
{
HStack
{
Image("ic_comment")
Text("45")
}
}
.frame(minWidth:0,idealWidth:0)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,12)
.padding(.trailing,12)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct fragment_blog_detail_Previews: PreviewProvider {
    static var previews: some View {
        fragment_blog_detail()
    }
}
