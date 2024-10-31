import SwiftUI
struct information_activity: View {

var body: some View {
ScrollView
{
ZStack
{
ZStack
{
VStack
{
Text("Bip4cast")
.padding(.top,45)
.bold()
.font(.system(size: 43))
.foregroundColor(Color(red:0.9137255,green:0.11764706,blue:0.3882353,opacity:1.0))
Image("logo")
.frame(minHeight:170,idealHeight:170)
.padding(.top,30)
}
Text("VERSION 2.1")
.padding(.top,38)
.bold()
Text("Developed by Ana María Martínez Gómez in a project at UCM")
.padding(.top,8)
.padding(.leading,45)
.padding(.trailing,45)
Text("See terms and conditions")
.padding(.top,32)
.padding(.bottom,50)
.foregroundColor(Color(red:0.0,green:0.6901961,blue:1.0,opacity:1.0))
}
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
}
}}}

struct information_activity_Previews: PreviewProvider {
    static var previews: some View {
        information_activity()
    }
}
