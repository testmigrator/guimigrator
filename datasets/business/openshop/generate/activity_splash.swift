import SwiftUI
struct activity_splash: View {

var body: some View {
ZStack
{
Image("")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background("splash_screen")
.accessibility(label: Text("Intro screen"))
ZStack
{
Image("login_background")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.accessibility(label: Text("Background"))
VStack
{
Text("No network connection")
.padding(.top,20)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("Retry")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(.top,16)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,30)
.padding(.leading,16)
.padding(.trailing,16)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
VStack
{
Text("Select the country n where you want to shop ")
.padding(.top,20)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:290,idealWidth:290)
.listStyle(PlainListStyle())
.padding(.top,8)
.padding(.bottom,16)
.background(Image("spinner_selector_white").resizable())
Button(action: {})
{
Text("Continue")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
.padding(.bottom,30)
.padding(.leading,16)
.padding(.trailing,16)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_splash_Previews: PreviewProvider {
    static var previews: some View {
        activity_splash()
    }
}
