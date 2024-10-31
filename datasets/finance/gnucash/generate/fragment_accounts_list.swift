import SwiftUI
struct fragment_accounts_list: View {

var body: some View {
ZStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.bottom,80)
Text("No accounts to display")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:0.67058825,blue:0.0,opacity:1.0))
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_accounts_list_Previews: PreviewProvider {
    static var previews: some View {
        fragment_accounts_list()
    }
}
