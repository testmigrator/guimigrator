import SwiftUI
struct list_item_filter_select: View {

var body: some View {
VStack
{
Text("Size")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 14))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity)
.listStyle(PlainListStyle())
.padding(.leading,6)
.padding(.trailing,2)
.padding(.leading,6)
.padding(.trailing,2)
.background(Image("spinner_selector_black_baseline").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct list_item_filter_select_Previews: PreviewProvider {
    static var previews: some View {
        list_item_filter_select()
    }
}
