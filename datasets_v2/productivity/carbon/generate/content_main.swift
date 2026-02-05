import SwiftUI
struct content_main: View {
@State private  var switch1  = false
@State private  var switch1  = false
@State private  var switch1  = false
@State private  var switch1  = false
var body: some View {
ZStack
{
ZStack
{
VStack
{
HStack
{
Toggle(isOn: $switch1)
{
Text("All contacts")
.foregroundColor(.black)
.padding(.top,5)
}
.padding(.top,5)
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
.padding(.top,7)
.padding(.bottom,47)
.background(Image("elesimulation").resizable())
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct content_main_Previews: PreviewProvider {
    static var previews: some View {
        content_main()
    }
}
