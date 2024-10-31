import SwiftUI
struct memo_item: View {

var body: some View {
HStack
{
ZStack
{
Image("icon_upload")
.frame(minWidth:22,idealWidth:22,minHeight:22,idealHeight:22)
.accessibility(label: Text("@null"))
.opacity(0.0)
VStack
{
Rectangle()
.padding(.top,5)
Text("@null")
.frame(minWidth:0,maxWidth:.infinity,minHeight:20,idealHeight:20)
.padding(.top,5)
.font(.system(size: 12))
.foregroundColor(Color(red:0.69411767,green:0.69411767,blue:0.69411767,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,5)
.padding(.bottom,5)
.padding(.leading,10)
.padding(.trailing,9)
.background(Image("hover_background").resizable())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(3)}}

struct memo_item_Previews: PreviewProvider {
    static var previews: some View {
        memo_item()
    }
}
