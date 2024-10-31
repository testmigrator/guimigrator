import SwiftUI
struct spinner_item_simple_text: View {

var body: some View {
HStack
{
Text("")
.padding(3)
.truncationMode(.tail)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,2)
.padding(.bottom,1)
.padding(.leading,5)
.padding(.trailing,1)
.padding(.leading,5)
.padding(.trailing,1)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct spinner_item_simple_text_Previews: PreviewProvider {
    static var previews: some View {
        spinner_item_simple_text()
    }
}
