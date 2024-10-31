import SwiftUI
struct comment: View {

var body: some View {
HStack
{
HStack
{
HStack
{
Text("")
}
.frame(minWidth:5,idealWidth:5)
}
.hidden()
VStack
{
ZStack
{
HStack
{
Text("")
.font(.system(size: 14))
.foregroundColor(Color(.gray))
Text("")
.frame(minWidth:4,idealWidth:4)
Text("")
.padding(.leading,10)
.font(.system(size: 14))
.foregroundColor(Color(.gray))
}
HStack
{
Text("")
.font(.system(size: 14))
.foregroundColor(Color(.gray))
HStack
{
Text("")
}
.frame(minWidth:14,idealWidth:14,minHeight:14,idealHeight:14)
.padding(.top,3)
.padding(.leading,2)
.background(Image("comment").resizable())
}
.padding(.leading,4)
.padding(.trailing,4)
.background(Image("tag").resizable())
}
.padding(.bottom,8)
.padding(.top,16)
.padding(.leading,16)
.padding(.trailing,16)
Text("")
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
.font(.system(size: 15))
HStack
{
Text("")
}
.frame(minHeight:1,idealHeight:1)
.background(Color.white)
}
}}}

struct comment_Previews: PreviewProvider {
    static var previews: some View {
        comment()
    }
}
