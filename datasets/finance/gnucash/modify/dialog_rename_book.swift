import SwiftUI
struct dialog_rename_book: View {
    
    var body: some View {
        VStack
        {
            TextField("", text: .constant("Book Name"))
                .frame(minWidth:0,maxWidth:.infinity)
                .font(.system(size: 16))
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .padding(10)}}

struct dialog_rename_book_Previews: PreviewProvider {
    static var previews: some View {
        dialog_rename_book()
    }
}
