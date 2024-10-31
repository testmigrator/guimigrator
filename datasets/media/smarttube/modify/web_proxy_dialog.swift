import SwiftUI
struct web_proxy_dialog: View {
@State private  var proxy_type  : String? 
var body: some View {
VStack
{
TextField("Proxy hostname or IP", text: .constant(""))
TextField("Proxy port", text: .constant(""))
TextField("Proxy username", text: .constant(""))
TextField("Proxy password", text: .constant(""))
Text("Proxy Type")
.padding(.top,16)
.padding(5)
.font(.system(size: 18))
HStack
{
Button(action: { proxy_type = "HTTP" })
{
HStack
{
Image(systemName: proxy_type == "HTTP" ? "checkmark.circle.fill" : "circle")
Text("HTTP")
.foregroundColor(.black)
}
}
Button(action: { proxy_type = "SOCKS" })
{
HStack
{
Image(systemName: proxy_type == "SOCKS" ? "checkmark.circle.fill" : "circle")
Text("SOCKS")
.foregroundColor(.black)
}
}
}
Text("")
.padding(.top,16)
.padding(5)
}
.padding(10)}}

struct web_proxy_dialog_Previews: PreviewProvider {
    static var previews: some View {
        web_proxy_dialog()
    }
}
