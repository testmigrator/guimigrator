import SwiftUI
struct account_view_sidebar: View {

var body: some View {
ZStack()//update
{
VStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(6)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct account_view_sidebar_Previews: PreviewProvider {
    static var previews: some View {
        account_view_sidebar()
    }
}
