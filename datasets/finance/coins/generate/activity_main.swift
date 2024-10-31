import SwiftUI
struct activity_main: View {

var body: some View {
ZStack
{
VStack
{
Text("$0.00")
.bold()
.font(.system(size: 50))
.foregroundColor(Color())
Text("0 BTC")
.padding(.top,10)
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:0.5019608))
}
Text("Never updated")
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:0.28235295))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
.background(Image("gradient").resizable())}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
