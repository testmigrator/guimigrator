import SwiftUI
struct states_activity_layout: View {

var body: some View {
ZStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:50,idealHeight:50)
.listStyle(PlainListStyle())
Text("Sample Output Text")
.bold()
.font(.system(size: 26))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
VStack
{
VStack
{
Image("girl_transparent")
HStack
{
Spacer()
VStack
{
Text("")
}
.padding(.bottom,60)
}
}
HStack
{
Spacer()
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
}
}
Text("Tap on mic to speak")
.italic()
.font(.system(size: 15))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
VStack
{
Text("Choose the name of the state from the list")
.padding(.top,49)
.italic()
.font(.system(size: 15))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("OR")
.italic()
.font(.system(size: 15))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Image("rsz_home_bg").resizable())}}

struct states_activity_layout_Previews: PreviewProvider {
    static var previews: some View {
        states_activity_layout()
    }
}
