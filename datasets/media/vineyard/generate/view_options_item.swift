import SwiftUI
struct view_options_item: View {

var body: some View {
ZStack
{
VStack
{
ZStack
{
Image("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.0,green:0.4745098,blue:0.41960785,opacity:1.0))
VStack
{
Text("")
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("")
.font(.system(size: 14))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:0.8666667))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
.background(Color(red:0.0,green:0.5882353,blue:0.53333336,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct view_options_item_Previews: PreviewProvider {
    static var previews: some View {
        view_options_item()
    }
}
