import SwiftUI
struct contact_list_filter_view: View {

var body: some View {
ZStack()//update
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.listStyle(PlainListStyle())
.padding(0)
.padding(.top,6)
.padding(0)
Text("loading…")
.font(.system(size: 24))
}
.background(Color.white)
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(0)}}

struct contact_list_filter_view_Previews: PreviewProvider {
    static var previews: some View {
        contact_list_filter_view()
    }
}
