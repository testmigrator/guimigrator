import SwiftUI
struct account_balance_toolbar: View {
    
    var body: some View {
        HStack
        {
            Text("Balance:")
                .frame(minWidth:0,idealWidth:0)
                .padding(.leading,12)
            Text("")
                .padding(.trailing,12)
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .background(Image("abc_ab_share_pack_mtrl_alpha").resizable())}}

struct account_balance_toolbar_Previews: PreviewProvider {
    static var previews: some View {
        account_balance_toolbar()
    }
}
