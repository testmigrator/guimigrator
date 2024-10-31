import SwiftUI
struct fragment_page: View {

var body: some View {
VStack
{
Text("Content is empty.")
.hidden()
VStack
{
Text("")
.padding(.bottom,16)
.font(.system(size: 20))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
WebView
.frame(minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.opacity(1.0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,16)
.padding(.trailing,16)}}

struct fragment_page_Previews: PreviewProvider {
    static var previews: some View {
        fragment_page()
    }
}
