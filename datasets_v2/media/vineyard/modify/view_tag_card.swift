import SwiftUI
struct view_tag_card: View {

var body: some View {
ZStack
{
HStack
{
Image("")
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,0)
Text("")
.padding(.leading,16)
.padding(.trailing,16)
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct view_tag_card_Previews: PreviewProvider {
    static var previews: some View {
        view_tag_card()
    }
}
