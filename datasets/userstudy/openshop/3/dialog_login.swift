import SwiftUI
struct dialog_login: View {
@State private  var login_registration_sex  : String? 
var body: some View {
ZStack
{
Image("login_background")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.accessibility(label: Text("Background"))
VStack
{
Text("Log in to shop via")
.padding(16)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("E-MAIL")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(.leading,16)
.padding(.trailing,32)
.padding(.leading,16)
.padding(.trailing,32)
Button(action: {})
{
Text("FACEBOOK")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(.top,8)
.padding(.leading,16)
.padding(.trailing,32)
.padding(.leading,16)
.padding(.trailing,32)
ZStack
{
Text("Don't have an account?")
.overlay(Image("arrow_right_accent")
.padding(4))
.padding(.top,12)
.padding(.bottom,12)
.font(.system(size: 16))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.background(Color.white)
Text("Skip")
.overlay(Image("arrow_right_accent")
.padding(4))
.padding(.top,12)
.padding(.bottom,12)
.font(.system(size: 16))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.background(Color.white)
}
.frame(minWidth:290,idealWidth:290)
.padding(.top,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,15)
.padding(.leading,16)
.padding(.trailing,16)
.opacity(1.0)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
VStack
{
HStack
{
Text("Don't have an account?")
.frame(minWidth:0,idealWidth:0)
.padding(.top,16)
.padding(.bottom,16)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(5)
}
.frame(minWidth:290,idealWidth:290)
HStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,8)
.padding(.leading,16)
.padding(.trailing,8)
.lineLimit(1)
}
.frame(minWidth:290,idealWidth:290)
HStack
{
TextField("Password", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,8)
.padding(.leading,16)
.padding(.trailing,8)
}
.frame(minWidth:290,idealWidth:290)
.padding(.top,2)
HStack
{
Button(action: { b6b7adc0-4a31-404e-a6ed-64a0ce61ace3 = "Male" })
{
HStack
{
Image(systemName: b6b == "Male" ? "checkmark.circle.fill" : "circle")
.padding(.trailing,24)
.padding(.trailing,24)
.padding(.top,15)
.padding(.bottom,15)
Text("Male")
.foregroundColor(.black)
.padding(.trailing,24)
.padding(.trailing,24)
.padding(.top,15)
.padding(.bottom,15)
}
.padding(.trailing,24)
.padding(.trailing,24)
.padding(.top,15)
.padding(.bottom,15)
}
.padding(.trailing,24)
.padding(.trailing,24)
.padding(.top,15)
.padding(.bottom,15)
Button(action: { b6b7adc0-4a31-404e-a6ed-64a0ce61ace3 = "Female" })
{
HStack
{
Image(systemName: b6b == "Female" ? "checkmark.circle.fill" : "circle")
.padding(.top,15)
.padding(.bottom,15)
Text("Female")
.foregroundColor(.black)
.padding(.top,15)
.padding(.bottom,15)
}
.padding(.top,15)
.padding(.bottom,15)
}
.padding(.top,15)
.padding(.bottom,15)
}
Button(action: {})
{
Text("Register")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,28)
.padding(.leading,16)
.padding(.trailing,16)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
VStack
{
HStack
{
Text("Log in to shop via email")
.frame(minWidth:0,idealWidth:0)
.padding(.top,16)
.padding(.bottom,16)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(5)
}
.frame(minWidth:290,idealWidth:290)
HStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,8)
.padding(.leading,16)
.padding(.trailing,8)
.lineLimit(1)
}
.frame(minWidth:290,idealWidth:290)
HStack
{
TextField("Password", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,8)
.padding(.leading,16)
.padding(.trailing,8)
}
.frame(minWidth:290,idealWidth:290)
.padding(.top,2)
Text("Forget your password?")
.padding(16)
.font(.system(size: 16))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("Log me in")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(.top,4)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,28)
.padding(.leading,16)
.padding(.trailing,16)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
VStack
{
HStack
{
Text("Forget your password?")
.frame(minWidth:0,idealWidth:0)
.padding(.top,16)
.padding(.bottom,16)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(5)
}
.frame(minWidth:290,idealWidth:290)
HStack
{
Text("")
.frame(minWidth:290,idealWidth:290)
.padding(.leading,16)
.padding(.trailing,8)
.padding(.leading,16)
.padding(.trailing,8)
.lineLimit(1)
}
.frame(minWidth:290,idealWidth:290)
Button(action: {})
{
Text("Reset")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(.top,12)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,28)
.padding(.leading,16)
.padding(.trailing,16)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_login_Previews: PreviewProvider {
    static var previews: some View {
        dialog_login()
    }
}
