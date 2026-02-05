import SwiftUI
struct account_view: View {
@State private  var statusSwitch  = false
var body: some View {
Rectangle()
{
HStack
{
VStack
{
HStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
}
Text("")
}
.frame(minWidth:0,idealWidth:0)
Button(action: { self.statusSwitch.toggle() })
{
HStack
{
Image(systemName: statusSwitch ? "checkmark.square" : "square")
.padding(.leading,6)
.padding(.trailing,6)
Text("null")
.foregroundColor(.black)
.padding(.leading,6)
.padding(.trailing,6)
}
.padding(.leading,6)
.padding(.trailing,6)
}
.background(Color.blue)
.padding(.leading,6)
.padding(.trailing,6)
}
.frame(minWidth:0,idealWidth:0)
.padding(6)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct account_view_Previews: PreviewProvider {
    static var previews: some View {
        account_view()
    }
}
