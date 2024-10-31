import SwiftUI
struct activtiy_setting: View {
@State private  var open_toggle  = false
var body: some View {
VStack
{
Rectangle()
.fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
VStack
{
HStack
{
Image("ic_evernote")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
.accessibility(label: Text("@null"))
Text("Connect")
.frame(minWidth:0,idealWidth:0)
.padding(.leading,10)
Image("ic_rightarrow")
.frame(minWidth:20,idealWidth:20,minHeight:20,idealHeight:20)
.accessibility(label: Text("@null"))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:55,idealHeight:55)
.background(Image("setting_item").resizable())
Rectangle()
.fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
HStack
{
Image("ic_start")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
.accessibility(label: Text("@null"))
Text("New memo when start-up")
.frame(minWidth:0,idealWidth:0)
.padding(.leading,10)
VStack
{
Button(action: { self.open_toggle.toggle() })
{
Text(open_toggle ? "Yes" : "No")
.foregroundColor(.black)
.background(Color.blue)
}
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:55,idealHeight:55)
.background(Image("setting_item").resizable())
Rectangle()
.fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
HStack
{
Image("ic_heart")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
.accessibility(label: Text("@null"))
Text("Rate for us")
.frame(minWidth:0,idealWidth:0)
.padding(.leading,10)
Image("ic_rightarrow")
.frame(minWidth:20,idealWidth:20,minHeight:20,idealHeight:20)
.accessibility(label: Text("@null"))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:55,idealHeight:55)
.background(Image("setting_item").resizable())
Rectangle()
.fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,15)
.padding(.trailing,15)
Text("Proudly made by Mudlab9nCoded by Daimajia,Designed by Plidezusnmade in Beijing&Shanghai")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.bottom,15)
.font(.system(size: 11))
.foregroundColor(Color(red:0.49411765,green:0.49411765,blue:0.49411765,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.90588236,green:0.90588236,blue:0.90588236,opacity:1.0))}}

struct activtiy_setting_Previews: PreviewProvider {
    static var previews: some View {
        activtiy_setting()
    }
}
