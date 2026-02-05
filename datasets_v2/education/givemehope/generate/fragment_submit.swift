import SwiftUI
struct fragment_submit: View {

var body: some View {
VStack
{
Text("Submit")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 20))
.foregroundColor(Color())
ScrollView
{
VStack
{
TextField("Name", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
TextField("Location", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
TextField("Title", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
TextField("Story", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity)
.listStyle(PlainListStyle())
.padding(.top,8)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(24)}}

struct fragment_submit_Previews: PreviewProvider {
    static var previews: some View {
        fragment_submit()
    }
}
