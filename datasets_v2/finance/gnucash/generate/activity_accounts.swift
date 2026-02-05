import SwiftUI
struct activity_accounts: View {

var body: some View {
NavigationView
{
HStack
{
NavigationView
{
ZStack
{
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.white)
}
.frame(minWidth:0,maxWidth:.infinity)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.padding(20)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.frame(minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_accounts_Previews: PreviewProvider {
    static var previews: some View {
        activity_accounts()
    }
}
