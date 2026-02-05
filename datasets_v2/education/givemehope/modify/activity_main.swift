import SwiftUI
struct activity_main: View {

var body: some View {
VStack
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.white)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
