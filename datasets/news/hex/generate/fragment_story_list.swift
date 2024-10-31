import SwiftUI
struct fragment_story_list: View {

var body: some View {
HStack
{
VStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
VStack
{
Image("")
.frame(minWidth:80,idealWidth:80,minHeight:80,idealHeight:80)
.background("cloud_off")
.padding(.top)
.padding(.bottom,15)
.accessibility(label: Text("@null"))
Text("Unable to load content")
.padding(.bottom,20)
.font(.system(size: 20))
Button(action: {})
{
Text("Try Again")
.foregroundColor(.black)
}
.background(Color.blue)
}
.padding(16)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_story_list_Previews: PreviewProvider {
    static var previews: some View {
        fragment_story_list()
    }
}
