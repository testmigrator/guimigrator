import SwiftUI
struct chat_view: View {

var body: some View {
Rectangle()
{
ProgressView()
.frame(minWidth:0,maxWidth:.infinity)
.padding(0)
.padding(0)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.listStyle(PlainListStyle())
.padding(0)
.padding(0)
.padding(.bottom,6)
ProgressView()
.frame(minWidth:0,maxWidth:.infinity)
.padding(0)
HStack
{
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.blue)
Rectangle()
.frame(minWidth:0,idealWidth:0)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.top,3)
.padding(.bottom,3)
.padding(.leading,5)
.padding(.trailing,5)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(3)
.background(Color.white)
Rectangle()
{
HStack
{
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:52,idealWidth:52,minHeight:52,idealHeight:52)
.background(Color.blue)
.padding(6)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.background(Color.blue)
.padding(3)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.background(Color.blue)
.padding(3)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.background(Color.blue)
.padding(3)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:64,idealWidth:64,minHeight:64,idealHeight:64)
.background(Color.blue)
.padding(3)
}
.background(Color.white)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:64,idealHeight:64)
Rectangle()
{
Rectangle()
.fill(Color(red:0.3372549,green:0.33333334,blue:0.32156864,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,4)
.padding(.bottom,4)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:140,idealHeight:140)
HStack
{
Text("%1$s has invited you to join a group chat.")
HStack
{
Button(action: {})
{
Text("Accept")
.foregroundColor(.black)
}
.background(Color.blue)
Button(action: {})
{
Text("Decline")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.leading,10)
}
}
.frame(minWidth:0,maxWidth:.infinity)
.alignmentGuide(.bottom) { _ in 0 }
.hidden()
.background(Color.white)
HStack
{
Text("Add %1$s?")
.padding(10)
HStack
{
Button(action: {})
{
Text("Yes")
.foregroundColor(.black)
}
.background(Color.blue)
Button(action: {})
{
Text("No")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.leading,10)
}
}
.frame(minWidth:0,maxWidth:.infinity)
.alignmentGuide(.bottom) { _ in 0 }
.hidden()
.background(Color.white)
HStack
{
Text("You are disconnected. Messages will be sent when you reconnect.")
.frame(minWidth:0,idealWidth:0)
.padding(3)
.foregroundColor(Color(red:1.0,green:0.0,blue:0.0,opacity:0.6666667))
}
.frame(minWidth:0,maxWidth:.infinity)
.alignmentGuide(.bottom) { _ in 0 }
.hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(0)
.padding(0)}}

struct chat_view_Previews: PreviewProvider {
    static var previews: some View {
        chat_view()
    }
}
