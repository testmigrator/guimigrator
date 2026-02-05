import SwiftUI
struct activity_login: View {

var body: some View {
ZStack
{
Image("")
.frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
.padding(.top,32)
.accessibility(label: Text("HTTP Sms Logo"))
VStack
{
Text("Opennhttpsms.com/settingsnto get your API key")
.padding(.bottom,20)
.font(.system(size: 20))
VStack
{
HStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,224)
}
}
VStack
{
HStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
VStack
{
Rectangle()
.padding(10)
Rectangle()
.padding(.top,4)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,16)
.padding(.trailing,16)}}

struct activity_login_Previews: PreviewProvider {
    static var previews: some View {
        activity_login()
    }
}
