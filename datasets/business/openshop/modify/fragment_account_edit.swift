import SwiftUI
struct fragment_account_edit: View {

var body: some View {
VStack
{
ScrollView
{
VStack
{
VStack
{
Text("Account")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
HStack
{
TextField("Name:", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)
HStack
{
HStack
{
TextField("Street", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
.padding(.bottom,8)
HStack
{
TextField("House code", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
.padding(.bottom,8)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
HStack
{
TextField("City", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
.padding(.bottom,8)
HStack
{
TextField("ZIP", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
.padding(.bottom,8)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
TextField("Email", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
HStack
{
TextField("Phone", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
}
.frame(minWidth:0,maxWidth:.infinity)
.opacity(1.0)
VStack
{
Text("Changing the password")
.padding(.top,16)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
HStack
{
TextField("Password", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)
HStack
{
TextField("New password", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,8)
HStack
{
TextField("Password again", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.hidden()
Button(action: {})
{
Text("Change password")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(16)
}
.padding(.leading,16)
.padding(.trailing,16)
}
.frame(minHeight:0,idealHeight:0)
Button(action: {})
{
Text("Save")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_account_edit_Previews: PreviewProvider {
    static var previews: some View {
        fragment_account_edit()
    }
}
