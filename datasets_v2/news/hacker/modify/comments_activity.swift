import SwiftUI
struct comments_activity: View {

var body: some View {
VStack
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
.background(Color(red:1.0,green:0.92941177,blue:0.85882354,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct comments_activity_Previews: PreviewProvider {
    static var previews: some View {
        comments_activity()
    }
}
