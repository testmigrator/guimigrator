import SwiftUI
struct activity_edit_btc: View {

var body: some View {
ZStack
{
TextField("", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
.background(Image("gradient").resizable())}}

struct activity_edit_btc_Previews: PreviewProvider {
    static var previews: some View {
        activity_edit_btc()
    }
}
