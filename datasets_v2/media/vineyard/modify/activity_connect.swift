import SwiftUI
struct activity_connect: View {

var body: some View {
ZStack
{
VStack
{
Image("vineyard")
.padding(.bottom,40)
.hidden()
ZStack
{
VStack
{
Text("Username")
.padding(.bottom,8)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.hidden()
TextField("Username", text: .constant(""))
.frame(minWidth:360,idealWidth:360)
.padding(.bottom,18)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
Text("Password")
.padding(.bottom,8)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.hidden()
TextField("Password", text: .constant(""))
.frame(minWidth:360,idealWidth:360)
.padding(.bottom,18)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("Sign In")
.foregroundColor(.white)
}

    ProgressView().hidden()
}
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.0,green:0.5882353,blue:0.53333336,opacity:1.0))}}

struct activity_connect_Previews: PreviewProvider {
    static var previews: some View {
        activity_connect()
    }
}
