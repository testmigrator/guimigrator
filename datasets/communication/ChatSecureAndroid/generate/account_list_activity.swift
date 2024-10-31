import SwiftUI
struct account_list_activity: View {

var body: some View {
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
Text("< swipe left and right for more options >")
.frame(minWidth:0,maxWidth:.infinity)
.padding(8)
.padding(.top,0)
.foregroundColor(Color(red:0.8,green:0.8,blue:0.8,opacity:1.0))
.background(Color(red:0.2,green:0.2,blue:0.2,opacity:0.8666667))
Rectangle()
.fill(Color(red:0.2,green:0.2,blue:0.2,opacity:0.8666667))
.frame(minWidth:0,maxWidth:.infinity,minHeight:40,idealHeight:40)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct account_list_activity_Previews: PreviewProvider {
    static var previews: some View {
        account_list_activity()
    }
}
