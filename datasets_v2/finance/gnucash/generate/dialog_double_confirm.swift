import SwiftUI
struct dialog_double_confirm: View {
@State private  var checkbox_confirm  = false
var body: some View {
VStack
{
Button(action: { self.checkbox_confirm.toggle() })
{
HStack
{
Image(systemName: checkbox_confirm ? "checkmark.square" : "square")
Text("Yes, I'm sure")
.foregroundColor(.black)
}
}
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)}}

struct dialog_double_confirm_Previews: PreviewProvider {
    static var previews: some View {
        dialog_double_confirm()
    }
}
