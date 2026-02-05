import SwiftUI
struct teach_name: View {

var body: some View {
ZStack
{
Text("My name is......")
.bold()
.font(.system(size: 26))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
VStack
{
HStack
{
Image("girl_transparent")
.background(Color.black)
Text("Press the button below to listen")
.padding(.top,39)
.italic()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
HStack
{
Spacer()
Text("सुनने के लिए नीचे दिए गए बटन दबाएं")
.italic()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
}
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
.background(Color.blue)
Text("Tap the mic to repeat ...")
.italic()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minHeight:230,idealHeight:230)
.background(Color.blue)
Text("दोहराने के लिए माइक टैप करें ...")
.italic()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Image("rsz_home_bg").resizable())}}

struct teach_name_Previews: PreviewProvider {
    static var previews: some View {
        teach_name()
    }
}
