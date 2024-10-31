import SwiftUI
struct fragment_settings: View {

var body: some View {
VStack
{
VStack
{
Text("Select the country n where you want to shop ")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
List
{
ForEach(1..<2)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.top,8)
.background(Image("spinner_selector_black_baseline").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)
VStack
{
Text("Open source libraries")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.padding(.trailing,110)
Text("License details for open source software")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 15))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
VStack
{
Text("Privacy policy")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.padding(.trailing,150)
Text("Basic information about Privacy Policy")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 15))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
HStack
{
Button(action: {})
{
Text("Cancel")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.top,0)
.padding(.trailing,8)
Button(action: {})
{
Text("Apply")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.top,0)
.padding(.trailing,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
.hidden()
.background(Color(red:0.654902,green:0.654902,blue:0.654902,opacity:0.84313726))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(16)}}

struct fragment_settings_Previews: PreviewProvider {
    static var previews: some View {
        fragment_settings()
    }
}
