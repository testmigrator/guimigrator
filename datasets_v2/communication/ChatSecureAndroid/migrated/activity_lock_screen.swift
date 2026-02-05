
import SwiftUI
struct activity_lock_screen: View {
var body: some View {
VStack
{
VStack
{
VStack
{
Button(action: {})
{
Text("Set Password")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.top,0)
.padding(.leading,15)
.padding(.trailing,15)
Button(action: {})
{
Text("Skip >>")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(15)
.padding(.top,5)
}
.frame(minWidth:0,maxWidth:.infinity)
VStack
{
HStack
{
TextField("Password", text: .constant(""))
.frame(minWidth:300,idealWidth:300)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(5)
}
.frame(minWidth:0,maxWidth:.infinity)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(12)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:0.8666667))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_lock_screen_Previews: PreviewProvider {
    static var previews: some View {
        activity_lock_screen()
    }
}
