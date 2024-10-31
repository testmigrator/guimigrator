import SwiftUI
struct main_list_item: View {

var body: some View {
HStack
{
VStack
{
Text("No Topic Defined")
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:0.14901961,green:0.13725491,blue:0.12941177,opacity:1.0))
HStack
{
Text("")
.font(.system(size: 12))
.foregroundColor(Color(red:0.47058824,green:0.4392157,blue:0.40392157,opacity:1.0))
.background(Image("points_roundedrect").resizable())
Text("No URL Defined")
.padding(.leading,10)
.font(.system(size: 12))
.foregroundColor(Color(red:0.47058824,green:0.4392157,blue:0.40392157,opacity:1.0))
}
.padding(.top,5)
}
.frame(minWidth:0,idealWidth:0)
.padding(.top,8)
.padding(.bottom,8)
.padding(.leading,12)
.padding(.trailing,12)
.background(Image("main_list_selector").resizable())
VStack
{
Button(action: {})
{
Text("0")
.foregroundColor(.black)
}
.background(Color.blue)
}
.padding(8)
.background(Color(red:0.9843137,green:0.9137255,blue:0.84705883,opacity:1.0))
}}}

struct main_list_item_Previews: PreviewProvider {
    static var previews: some View {
        main_list_item()
    }
}
