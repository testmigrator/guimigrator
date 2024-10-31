import SwiftUI
struct activity_recent_deletes: View {

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
.padding(.top,7)
.padding(.bottom,7)
.background(Image("elesimulation").resizable())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)}}

struct activity_recent_deletes_Previews: PreviewProvider {
    static var previews: some View {
        activity_recent_deletes()
    }
}
