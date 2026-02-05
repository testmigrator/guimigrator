import SwiftUI
struct cardview_budget_amount: View {

var body: some View {
Rectangle()
{
ZStack
{
VStack
{
HStack
{
Text("Expenses:Phone:Android")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 16))
.foregroundColor(Color(.gray))
Text("$ 3000")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 16))
.foregroundColor(Color(.gray))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,10)
HStack
{
Text("Spent")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
Text("Left")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
}
.frame(minWidth:0,maxWidth:.infinity)
}
Text("$500")
.font(.system(size: 15))
.foregroundColor(Color(.gray))
Text("$2,500")
.font(.system(size: 15))
.foregroundColor(Color(.gray))
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:10,idealHeight:10)
.padding(.top,5)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,10)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct cardview_budget_amount_Previews: PreviewProvider {
    static var previews: some View {
        cardview_budget_amount()
    }
}
