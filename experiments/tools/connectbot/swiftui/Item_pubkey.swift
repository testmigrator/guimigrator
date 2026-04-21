import SwiftUI

struct Item_pubkey: View {
  var body: some View {
    ZStack {
      Image("pubkey").resizable().scaledToFit().frame(width: 40.0, height: 40.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
        Text("Key Example").padding(.top, 20.0)
        Text("DSA 1024-bit").padding(.bottom, 20.0)
      }
      .padding(.leading, 72.0)
      .padding(.trailing, 16.0)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Item_pubkey_Previews: PreviewProvider {
  static var previews: some View {
    Item_pubkey()
  }
}
