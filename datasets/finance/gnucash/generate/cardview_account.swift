import SwiftUI
struct cardview_account: View {

var body: some View {
Rectangle()
{
ZStack
{
Rectangle()
.frame(minWidth:5,idealWidth:5)
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
HStack
{
HStack
{
Text("$ 2000.00")
.padding(.trailing,12)
.padding(.bottom,4)
.font(.system(size: 18))
.lineLimit(1)
Image("ic_add_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,20)
.padding(.bottom,4)
.padding(.leading,24)
.scaledToFit()
}
VStack
{
Image("ic_more_vert_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,20)
.padding(.bottom,4)
.padding(.leading,24)
.scaledToFit()
ProgressView()
.frame(minWidth:100,idealWidth:100,minHeight:8,idealHeight:8)
.padding(.leading,5)
.padding(.trailing,12)
.padding(.leading,5)
.padding(.bottom,4)
}
}
Image("ic_star_border_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,6)
.padding(.bottom,22)
.padding(.leading,22)
.padding(.trailing,6)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,5)
.padding(.trailing,5)}}

struct cardview_account_Previews: PreviewProvider {
    static var previews: some View {
        cardview_account()
    }
}
