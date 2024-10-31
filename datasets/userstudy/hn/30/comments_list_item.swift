import SwiftUI
struct comments_list_item: View {

var body: some View {
ZStack
{
HStack
{
HStack
{
Text("")
}
ZStack
{
HStack
{
VStack
{
Text("someauthor")
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.6117647,green:0.5686275,blue:0.5254902,opacity:1.0))
Rectangle()
.padding(.top,10)
}
Text("")
.font(.system(size: 14))
.foregroundColor(Color(red:0.6117647,green:0.5686275,blue:0.5254902,opacity:1.0))
}
}
.padding(.top,3)
.padding(.bottom,12)
.padding(.leading,12)
.padding(.trailing,12)
}
Image("expand")
.accessibility(label: Text("@null"))
}}}

struct comments_list_item_Previews: PreviewProvider {
    static var previews: some View {
        comments_list_item()
    }
}
