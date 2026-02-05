import SwiftUI
struct activity_main: View {

var body: some View {
ZStack
{
VStack
{
Image("")
.frame(minWidth:147,idealWidth:147,minHeight:92,idealHeight:92)
.padding(.top,16)
.accessibility(label: Text("HTTP Sms Logo"))
Rectangle()
{
VStack
{
HStack
{
Text("Phone Number")
.frame(minHeight:0,maxHeight:.infinity)
.overlay(Image("baseline_check_circle_24")
.padding(5))
.font(.system(size: 28))
.foregroundColor(Color(.gray))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Text("23/06/2022 18:58:30")
.padding(.top,8)
.font(.system(size: 16))
.foregroundColor(Color(.gray))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,24)
}
Text("httpsms.com - %s")
.padding(.top,16)
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,4)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
Rectangle()
.padding(.bottom,16)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,16)
.padding(.trailing,16)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
