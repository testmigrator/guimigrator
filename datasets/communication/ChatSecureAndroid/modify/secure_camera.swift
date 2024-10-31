import SwiftUI
struct secure_camera: View {

var body: some View {
ZStack
{
    ZStack(){}
Text("zero")
.padding(10)
.padding(.top,118)
.padding(.trailing,35)
.padding(10)
.font(.system(size: 30))
.hidden()
VStack
{
Button(action: {})
{
Text("")
.foregroundColor(.black)
}
.frame(minWidth:82,idealWidth:82,minHeight:82,idealHeight:82)
.overlay(Image("camera"))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(20)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct secure_camera_Previews: PreviewProvider {
    static var previews: some View {
        secure_camera()
    }
}
