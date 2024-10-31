import SwiftUI
struct fragment_trending: View {

var body: some View {
ZStack
{
HStack
{
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
.padding(.leading,8)
.padding(.trailing,8)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ProgressView()
Image("ic_error_white_48dp")
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_trending_Previews: PreviewProvider {
    static var previews: some View {
        fragment_trending()
    }
}
