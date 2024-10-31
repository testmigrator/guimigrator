import SwiftUI
struct fragment_drawer: View {

var body: some View {
ZStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:290,idealWidth:290,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
VStack
{
Button(action: {})
{
Text("All categories")
.foregroundColor(.black)
}
.frame(minWidth:290,idealWidth:290)
.background(Color.blue)
.padding(20)
Text("")
.frame(minWidth:290,idealWidth:290)
.padding(15)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:0.39215687,green:0.39215687,blue:0.39215687,opacity:1.0))
.background(Color(red:0.87058824,green:0.87058824,blue:0.87058824,opacity:1.0))
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:290,idealWidth:290,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
}
.frame(minWidth:290,idealWidth:290,minHeight:0,maxHeight:.infinity)
.hidden()
ProgressView()
Button(action: {})
{
Text("Retry")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(10)
}
.frame(minWidth:290,idealWidth:290,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct fragment_drawer_Previews: PreviewProvider {
    static var previews: some View {
        fragment_drawer()
    }
}
