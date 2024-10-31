import SwiftUI
struct dialog_map: View {

var body: some View {
ScrollView
{
VStack
{
HStack
{
Text("Pobocka v Brne")
.frame(minWidth:0,idealWidth:0)
.padding(8)
.bold()
.font(.system(size: 15))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.lineLimit(2)
    Spacer()
Image("close_black")
.background(Color.white)
.padding(8)
.accessibility(label: Text("Cancel"))
}
.frame(minWidth:0,maxWidth:.infinity)
ZStack
{
ZStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:290,idealHeight:290)
Image("#00000000")
.frame(minWidth:0,maxWidth:.infinity,minHeight:290,idealHeight:290)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:290,idealHeight:290)
VStack
{
Text("Bratislavska 14, Brno")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
VStack
{
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.overlay(Image("ic_menu_always_landscape_portrait")
    .padding(.trailing,320))
.font(.system(size: 13))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(8)
Button(action: {})
{
Text("Select")
.foregroundColor(.white)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.pink)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_map_Previews: PreviewProvider {
    static var previews: some View {
        dialog_map()
    }
}
