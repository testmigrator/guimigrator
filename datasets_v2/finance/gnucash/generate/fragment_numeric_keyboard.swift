import SwiftUI
struct fragment_numeric_keyboard: View {

var body: some View {
VStack
{
VStack
{
Image("ic_launcher")
HStack
{
TextField("", text: .constant(""))
TextField("", text: .constant(""))
TextField("", text: .constant(""))
TextField("", text: .constant(""))
}
.padding(.top,25)
Text("Enter Passcode")
.font(.system(size: 15))
}
List
{
HStack
{
VStack
{
Text("1")
Text("​")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("2")
Text("ABC")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("3")
Text("DEF")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
}
HStack
{
VStack
{
Text("4")
Text("GHI")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("5")
Text("JKL")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("6")
Text("MNO")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
}
HStack
{
VStack
{
Text("7")
Text("PQRS")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("8")
Text("TUV")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
VStack
{
Text("9")
Text("WXYZ")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
}
HStack
{
Rectangle()
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
VStack
{
Text("0")
Text("+")
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.padding(10)
.background(Image("numeric_button").resizable())
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:70,idealWidth:70,minHeight:70,idealHeight:70)
.background(Color.blue)
.padding(10)
}
}
}}}

struct fragment_numeric_keyboard_Previews: PreviewProvider {
    static var previews: some View {
        fragment_numeric_keyboard()
    }
}
