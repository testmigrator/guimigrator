import SwiftUI
struct collection_add_new: View {

var body: some View {
VStack
{
TextField("Enter title here", text: .constant(""))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct collection_add_new_Previews: PreviewProvider {
    static var previews: some View {
        collection_add_new()
    }
}
