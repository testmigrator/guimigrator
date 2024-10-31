import SwiftUI
struct aty_simple_fragment: View {

var body: some View {
VStack
{
Rectangle()
.fill(Color(red:0.12941177,green:0.5882353,blue:0.9529412,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity)
ZStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct aty_simple_fragment_Previews: PreviewProvider {
    static var previews: some View {
        aty_simple_fragment()
    }
}
