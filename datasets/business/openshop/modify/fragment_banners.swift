import SwiftUI
struct fragment_banners: View {

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
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
VStack
{
Text("No banners")
.overlay(Image("loyalty_tag_black_48dp")
.padding(20))
.padding(20)
Text("Show offers")
.padding(20)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
.background(Color.white)
}
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_banners_Previews: PreviewProvider {
    static var previews: some View {
        fragment_banners()
    }
}
