import SwiftUI
struct story_list_item: View {

var body: some View {
ZStack
{
VStack
{
HStack
{
Text("")
.font(.system(size: 14))
.foregroundColor(Color(.gray))
}
.padding(.bottom,5)
Text("")
.padding(.bottom,5)
.font(.system(size: 16))
.foregroundColor(Color(.gray))
HStack
{
HStack
{
Text("")
}
.frame(minWidth:13,idealWidth:13,minHeight:13,idealHeight:13)
.padding(.top,4)
.background(Image("arrow_upward").resizable())
Text("")
.padding(.leading,2)
.font(.system(size: 14))
.foregroundColor(Color(red:0.54509807,green:0.7647059,blue:0.2901961,opacity:1.0))
HStack
{
Text("")
}
.frame(minWidth:13,idealWidth:13,minHeight:13,idealHeight:13)
.padding(.top,4)
.padding(.leading,10)
.background(Image("comment").resizable())
Text("")
.padding(.leading,2)
.font(.system(size: 14))
.foregroundColor(Color(red:1.0,green:0.61960787,blue:0.5019608,opacity:1.0))
Text("")
.font(.system(size: 14))
Text("")
.padding(.leading,10)
.font(.system(size: 14))
.foregroundColor(Color(.gray))
}
}
ZStack
{
Image("")
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.background(Color.white)
.accessibility(label: Text("No image available"))
Image("")
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.accessibility(label: Text("Article feature image"))
}
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.padding(.leading,20)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,12)
.padding(.bottom,12)
.padding(.leading,16)
.padding(.trailing,16)}}

struct story_list_item_Previews: PreviewProvider {
    static var previews: some View {
        story_list_item()
    }
}
