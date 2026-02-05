import SwiftUI
struct fragment_budget_list: View {

var body: some View {
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.bottom,80)
Button(action: {})
{
Text("Propose Budgets")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_budget_list_Previews: PreviewProvider {
    static var previews: some View {
        fragment_budget_list()
    }
}
