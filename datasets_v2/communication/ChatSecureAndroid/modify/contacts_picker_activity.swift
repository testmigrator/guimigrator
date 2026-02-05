import SwiftUI
struct contacts_picker_activity: View {

var body: some View {
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
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.listStyle(PlainListStyle())
.padding(0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color.white)}}

struct contacts_picker_activity_Previews: PreviewProvider {
    static var previews: some View {
        contacts_picker_activity()
    }
}
