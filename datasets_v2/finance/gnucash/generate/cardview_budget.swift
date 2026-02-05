import SwiftUI
struct cardview_budget: View {

var body: some View {
Rectangle()
{
VStack
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
Text("$2,500 monthly until 02/14")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,10)
.padding(.trailing,10)
.font(.system(size: 15))
.lineLimit(1)
ZStack
{
HStack
{
VStack
{
Text("$ 2000 of $ 2,500")
.frame(minWidth:0,maxWidth:.infinity)
.padding(5)
.font(.system(size: 18))
.foregroundColor(Color(.gray))
.lineLimit(1)
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:10,idealHeight:10)
.padding(.bottom,4)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,10)
.padding(.trailing,10)
Image("ic_more_vert_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,20)
.padding(.bottom,4)
.padding(.leading,24)
.scaledToFit()
}
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,5)
.padding(.trailing,5)}}

struct cardview_budget_Previews: PreviewProvider {
    static var previews: some View {
        cardview_budget()
    }
}
