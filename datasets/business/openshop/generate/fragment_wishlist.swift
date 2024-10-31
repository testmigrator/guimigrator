import SwiftUI
struct fragment_wishlist: View {

var body: some View {
ZStack
{
VStack
{
Image("wishlist_empty")
.accessibility(label: Text("Your wishlist is empty."))
Text("Your wishlist is empty.")
.padding(.top,20)
}
.hidden()
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
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_wishlist_Previews: PreviewProvider {
    static var previews: some View {
        fragment_wishlist()
    }
}
