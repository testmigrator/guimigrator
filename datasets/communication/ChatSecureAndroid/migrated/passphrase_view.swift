
import SwiftUI
struct passphrase_view: View {
var body: some View {
VStack
{
Text("Passphrase Setup")
.font(.system(size: 14))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
List
{
HStack
{
ScrollView
{
List
{
HStack
{
Text("Before you get started please choose a secure passphrase to protect your ChatSecure data from unjust access.")
}
HStack
{
Text("Passphrase")
.frame(minWidth:100,idealWidth:100)
}
HStack
{
TextField("", text: .constant(""))
.frame(minWidth:200,idealWidth:200,minHeight:30,idealHeight:30)
}
HStack
{
Text("Passphrase (again)")
.frame(minWidth:100,idealWidth:100)
}
HStack
{
TextField("", text: .constant(""))
.frame(minWidth:200,idealWidth:200,minHeight:30,idealHeight:30)
}
}
}
}
HStack
{
Button(action: {})
{
Text("button1")
.foregroundColor(.black)
}
.background(Color.blue)
Button(action: {})
{
Text("button2")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minHeight:30,idealHeight:30)
}
}}}

struct passphrase_view_Previews: PreviewProvider {
    static var previews: some View {
        passphrase_view()
    }
}
