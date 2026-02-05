import SwiftUI
struct fragment_split_editor: View {

var body: some View {
ZStack
{
HStack
{
Text("Imbalance:")
Text("$200")
.frame(minWidth:0,idealWidth:0)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
Rectangle()
.fill(Color(red:0.6666667,green:0.6666667,blue:0.6666667,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
.padding(.top,10)
.padding(.bottom,10)
ScrollView
{
VStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(10)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_split_editor_Previews: PreviewProvider {
    static var previews: some View {
        fragment_split_editor()
    }
}
