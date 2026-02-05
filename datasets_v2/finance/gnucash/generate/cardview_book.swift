import SwiftUI
struct cardview_book: View {

var body: some View {
Rectangle()
{
ZStack
{
ZStack
{
VStack
{
Text("Primary text")
.truncationMode(.tail)
Text("Secondary text")
.truncationMode(.middle)
}
}
.frame(minWidth:0,idealWidth:0)
Image("ic_more_vert_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,20)
.padding(.bottom,4)
.padding(.leading,24)
.scaledToFit()
HStack
{
Text("Last export:")
.padding(.bottom,4)
.font(.system(size: 14))
.foregroundColor(Color(.gray))
.lineLimit(1)
Text("Sat, 04 July")
.padding(.bottom,4)
.padding(.leading,5)
.padding(.leading,5)
.font(.system(size: 14))
.foregroundColor(Color(.gray))
.lineLimit(1)
}
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,5)
.padding(.trailing,5)}}

struct cardview_book_Previews: PreviewProvider {
    static var previews: some View {
        cardview_book()
    }
}
