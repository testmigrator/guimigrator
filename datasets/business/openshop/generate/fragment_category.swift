import SwiftUI
struct fragment_category: View {

var body: some View {
ZStack
{
HStack
{
NavigationView
{
ZStack
{
ZStack()
{}
.background(Color.white)
.padding(.top,10)
.padding(.bottom,10)
HStack
{
Image("filter_unselected")
.background(Color.white)
.padding(10)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.top,10)
.padding(.bottom,10)
.background(Image("spinner_selector_black").resizable())
}
}
.frame(minWidth:0,maxWidth:.infinity)
}
.padding(.leading,16)
.padding(.trailing,16)
.background(Color(red:0.9490196,green:0.9490196,blue:0.9490196,opacity:1.0))
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
Text("Products not found.")
.hidden()
}
HStack
{
ProgressView()
.padding(8)
}
.frame(minHeight:48,idealHeight:48)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.1764706))
}}}

struct fragment_category_Previews: PreviewProvider {
    static var previews: some View {
        fragment_category()
    }
}
