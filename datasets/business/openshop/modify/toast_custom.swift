import SwiftUI
struct toast_custom: View {

var body: some View {
HStack
{
Image("")
.padding(.trailing,8)
.padding(.trailing,8)
.accessibility(label: Text("@null"))
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(16)
.background(Image("toast_background").resizable())}}

struct toast_custom_Previews: PreviewProvider {
    static var previews: some View {
        toast_custom()
    }
}
