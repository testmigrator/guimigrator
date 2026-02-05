import SwiftUI
struct auth_view: View {

var body: some View {
HStack
{
Text("Password please…")
.bold()
TextField("", text: .constant(""))
{
Rectangle()
}
TextField("", text: .constant(""))
Button(action: {})
{
Text("OK")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minHeight:200,idealHeight:200)}}

struct auth_view_Previews: PreviewProvider {
    static var previews: some View {
        auth_view()
    }
}
