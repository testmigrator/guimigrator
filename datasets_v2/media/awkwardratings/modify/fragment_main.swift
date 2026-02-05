import SwiftUI
struct fragment_main: View {

var body: some View {
ZStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
VStack
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
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
.background(Color.white)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_main_Previews: PreviewProvider {
    static var previews: some View {
        fragment_main()
    }
}
