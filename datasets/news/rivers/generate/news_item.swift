import SwiftUI
struct news_item: View {

var body: some View {
ZStack
{
List
{
HStack
{
Text("")
.padding(3)
}
HStack
{
Text("")
.padding(3)
.font(.system(size: 11))
}
}
.padding(.trailing,5)
Text("")
.frame(minWidth:5,idealWidth:5)
}
.padding(.top,6)
.padding(.bottom,6)}}

struct news_item_Previews: PreviewProvider {
    static var previews: some View {
        news_item()
    }
}
