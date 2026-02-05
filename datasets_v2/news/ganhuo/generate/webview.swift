import SwiftUI
struct webview: View {

var body: some View {
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
WebView
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct webview_Previews: PreviewProvider {
    static var previews: some View {
        webview()
    }
}
