import SwiftUI
struct proxy_settings: View {
@State private  var cb_enable  = false
@State private  var cb_enable  = false
@State private  var cb_enable  = false
@State private  var cb_enable  = false
var body: some View {
ZStack
{
VStack
{
ZStack
{
HStack
{
Text("")
.padding(.top,10)
.padding(.bottom,10)
.padding(.leading,12)
.padding(.trailing,12)
.font(.system(size: 18))
Button(action: { self.cb_enable.toggle() })
{
HStack
{
Image(systemName: cb_enable ? "checkmark.square" : "square")
.padding(.trailing,12)
Text("null")
.foregroundColor(.black)
.padding(.trailing,12)
}
.padding(.trailing,12)
}
.background(Color.blue)
.padding(.trailing,12)
}
}
.frame(minHeight:60,idealHeight:60)
.background(Color(red:0.8666667,green:0.8666667,blue:0.8666667,opacity:0.3764706))
Text("")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct proxy_settings_Previews: PreviewProvider {
    static var previews: some View {
        proxy_settings()
    }
}
