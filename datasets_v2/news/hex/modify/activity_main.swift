import SwiftUI
struct activity_main: View {

var body: some View {
VStack
{
NavigationView
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
VStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
