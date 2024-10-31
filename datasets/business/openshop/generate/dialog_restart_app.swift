import SwiftUI
struct dialog_restart_app: View {

var body: some View {
VStack
{
Text("Restart")
.font(.system(size: 20))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("To change the shop an app restart is needed.")
.padding(.top,8)
.font(.system(size: 16))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
HStack
{
Button(action: {})
{
Text("Cancel")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.top,8)
.padding(.bottom,8)
Button(action: {})
{
Text("OK")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.leading,15)
.padding(.top,8)
.padding(.bottom,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,15)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(16)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct dialog_restart_app_Previews: PreviewProvider {
    static var previews: some View {
        dialog_restart_app()
    }
}
