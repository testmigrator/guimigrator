import SwiftUI
struct fragment_account: View {

var body: some View {
ZStack
{
VStack
{
VStack
{
Text("Name:")
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
Text("User and Surname")
.font(.system(size: 16))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Address:")
.padding(.top,16)
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
Text("Brnenska 14, Brno, 61200")
.padding(.trailing,6)
.padding(.trailing,6)
.font(.system(size: 16))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Email:")
.padding(.top,16)
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
Text("test@mailing.com")
.font(.system(size: 16))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Phone:")
.padding(.top,16)
.font(.system(size: 12))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
Text("903578123")
.font(.system(size: 16))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.padding(.trailing,200)
VStack
{
HStack
{
Button(action: {})
{
Text("Account")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.gray)
ZStack()
{}
.frame(minWidth:16,idealWidth:16)
Button(action: {})
{
Text("My orders")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.gray)
}
.padding(.top,16)
HStack
{
Button(action: {})
{
Text("Branches")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.gray)
ZStack()
{}
.frame(minWidth:16,idealWidth:16)
Button(action: {})
{
Text("Settings")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.gray)
}
.padding(.top,16)
Button(action: {})
{
Text("Log in")
        .foregroundColor(.white)
}
.background(Color.pink)
.padding(.top,16)
.frame(minWidth:0,maxWidth:.infinity)
}

.padding(.top,16)
}
.padding(16)
}}}

struct fragment_account_Previews: PreviewProvider {
    static var previews: some View {
        fragment_account()
    }
}
