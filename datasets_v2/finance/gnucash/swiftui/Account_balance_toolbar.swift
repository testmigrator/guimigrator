import SwiftUI

struct Account_balance_toolbar: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("Balance:").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.leading, 12.0)
      Text("").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center).padding(.trailing, 12.0)
    }
    .background(Image("abc_ab_share_pack_mtrl_alpha").resizable().scaledToFill())
    .frame(maxWidth: .infinity)
    .padding(.top, 8.0)
    .padding(.bottom, 8.0)
  }
}

struct Account_balance_toolbar_Previews: PreviewProvider {
  static var previews: some View {
    Account_balance_toolbar()
  }
}
