import SwiftUI
struct internet_introduction_layout: View {

var body: some View {
ZStack
{
VStack
{
Text("
        nImagnine you want to play with your friend but he/she lives far off from your house.
        nNow imagine there is a tunnel below your house and theirs connecting them.
        nThese tunnels are magical so that you are transported to their place as soon as you step in the tunnel, you can share your toys and talk through this tunnel as well.
        nNow imagine all your friends and the entire world even has this tunnel below their houses.")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,65)
.padding(.leading,40)
.padding(.trailing,40)
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:0.89411765,blue:0.88235295,opacity:1.0))
.opacity(1.0)
Text("Internet is that tunnel!")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:0.89411765,blue:0.88235295,opacity:1.0))
.opacity(1.0)
}
Image("children01_thumb")
.background(Color.black)
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Image("rsz_home_bg").resizable())}}

struct internet_introduction_layout_Previews: PreviewProvider {
    static var previews: some View {
        internet_introduction_layout()
    }
}
