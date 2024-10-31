import SwiftUI
struct list_item_filter_range: View {

var body: some View {
VStack
{
Text("Price")
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
Text("")
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_filter_range_Previews: PreviewProvider {
    static var previews: some View {
        list_item_filter_range()
    }
}
