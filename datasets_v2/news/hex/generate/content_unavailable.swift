import SwiftUI
struct content_unavailable: View {

var body: some View {
VStack
{
Image("")
.frame(minWidth:80,idealWidth:80,minHeight:80,idealHeight:80)
.background("cloud_off")
.padding(.top)
.padding(.bottom,15)
.accessibility(label: Text("@null"))
Text("Unable to load content")
.padding(.bottom,20)
.font(.system(size: 20))
Button(action: {})
{
Text("Try Again")
.foregroundColor(.black)
}
.background(Color.blue)
}
.padding(16)}}

struct content_unavailable_Previews: PreviewProvider {
    static var previews: some View {
        content_unavailable()
    }
}
