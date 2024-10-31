import SwiftUI
struct empty_item: View {

var body: some View {
VStack
{
Image("")
.padding(.bottom,16)
Text("No Items")
.padding(.bottom,2)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(red:0.40784314,green:0.38431373,blue:0.45490196,opacity:1.0))
Text("No Items")
.font(.system(size: 14))
.foregroundColor(Color(red:0.5294118,green:0.5058824,blue:0.5647059,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,56)
.padding(.horizontal,24)
.padding([.leading, .trailing], 24dp)}}

struct empty_item_Previews: PreviewProvider {
    static var previews: some View {
        empty_item()
    }
}
