import SwiftUI
struct dialog_filters: View {

var body: some View {
VStack
{
Text("FILTER")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,15)
.bold()
.font(.system(size: 20))
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
HStack
{
Button(action: {})
{
Text("Clear")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
ZStack()
{}
.frame(minWidth:16,idealWidth:16,minHeight:5,idealHeight:5)
Button(action: {})
{
Text("Apply")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)}}

struct dialog_filters_Previews: PreviewProvider {
    static var previews: some View {
        dialog_filters()
    }
}
