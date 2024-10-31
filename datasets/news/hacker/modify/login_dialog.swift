import SwiftUI
struct login_dialog: View {

var body: some View {
VStack
{
TextField("Username", text: .constant(""))
.padding(.leading,5)
.padding(.trailing,5)
TextField("Password", text: .constant(""))
.padding(.leading,5)
.padding(.trailing,5)
HStack
{
Button(action: {})
{
Text("Save")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.white)
Button(action: {})
{
Text("Cancel")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.white)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct login_dialog_Previews: PreviewProvider {
    static var previews: some View {
        login_dialog()
    }
}
