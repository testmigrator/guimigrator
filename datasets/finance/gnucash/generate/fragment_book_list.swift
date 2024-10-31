import SwiftUI
struct fragment_book_list: View {

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
Text("No books in the database")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(10)}}

struct fragment_book_list_Previews: PreviewProvider {
    static var previews: some View {
        fragment_book_list()
    }
}
