import SwiftUI

struct Cardview_compact_transaction: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
          Text("Secondary text")
        }
        .frame(maxWidth: .infinity)
        Text("$450.000.000").font(.system(size: 18)).padding(.trailing, 10.0).frame(maxHeight: .infinity, alignment: .bottom)
        Image("ic_more_vert_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 20.0)
      }
      .frame(maxWidth: .infinity)
      .padding(5.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 5.0)
  }
}

struct Cardview_compact_transaction_Previews: PreviewProvider {
  static var previews: some View {
    Cardview_compact_transaction()
  }
}
