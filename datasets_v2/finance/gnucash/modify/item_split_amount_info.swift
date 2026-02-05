import SwiftUI
struct item_split_amount_info: View {
    
    var body: some View {
        HStack
        {
            Text("Computer")
                .frame(minWidth:0,idealWidth:0)
                .font(.system(size: 14))
                .foregroundColor(Color(.gray))
                .truncationMode(.middle)
            //update
            Text("$ 2000")
                .frame(minWidth:0,idealWidth:0)
                .font(.system(size: 16))
                .foregroundColor(Color(.gray))
            Text("$ 2000")
                .frame(minWidth:0,idealWidth:0)
                .font(.system(size: 16))
                .foregroundColor(Color(.gray))
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .padding(.leading,6)
        .padding(.top,5)
        .padding(.bottom,5)}}

struct item_split_amount_info_Previews: PreviewProvider {
    static var previews: some View {
        item_split_amount_info()
    }
}
