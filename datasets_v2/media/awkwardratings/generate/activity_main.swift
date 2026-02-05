import SwiftUI
struct activity_main: View {

var body: some View {
ZStack
{
ZStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
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
.padding(.top)
.background(Color.white)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
