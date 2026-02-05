import SwiftUI
struct chat_pager: View {

var body: some View {
ZStack
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
NavigationView
{
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ScrollView
{
VStack
{
Rectangle()
.frame(minWidth:240,idealWidth:240)
Button(action: {})
{
Text("Add Account")
.foregroundColor(.black)
}
.frame(minWidth:240,idealWidth:240)
.background(Color.blue)
.padding(.top,5)
}
.frame(minWidth:240,idealWidth:240)
}
.frame(minWidth:240,idealWidth:240,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct chat_pager_Previews: PreviewProvider {
    static var previews: some View {
        chat_pager()
    }
}
