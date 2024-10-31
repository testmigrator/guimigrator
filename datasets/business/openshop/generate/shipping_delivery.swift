import SwiftUI
struct shipping_delivery: View {

var body: some View {
ZStack
{
VStack
{
VStack
{
VStack
{
HStack
{
Image("back_arrow")
.background(Color.white)
.accessibility(label: Text("Back arrow"))
Text("Shipping")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
ProgressView()
.padding(.top,40)
}
VStack
{
Text("Shipping is empty")
.padding(.top,20)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,50)
.hidden()
}
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct shipping_delivery_Previews: PreviewProvider {
    static var previews: some View {
        shipping_delivery()
    }
}
