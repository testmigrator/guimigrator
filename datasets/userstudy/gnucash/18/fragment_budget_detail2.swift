import SwiftUI
struct fragment_budget_detail: View {

var body: some View {
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
Text("$2,500 monthly")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,10)
.padding(.trailing,10)
.font(.system(size: 15))
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,12)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_budget_detail_Previews: PreviewProvider {
    static var previews: some View {
        fragment_budget_detail()
    }
}
