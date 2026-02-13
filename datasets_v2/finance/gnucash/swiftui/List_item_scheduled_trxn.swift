import SwiftUI

struct List_item_scheduled_trxn: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Description").font(.system(size: 15)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity)
          Text("Amount").foregroundColor(Color.black).multilineTextAlignment(.trailing)
        }
        .frame(maxWidth: .infinity)
        Text("Description")
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 5.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 8.0)
    .padding(.bottom, 8.0)
  }
}

struct List_item_scheduled_trxn_Previews: PreviewProvider {
  static var previews: some View {
    List_item_scheduled_trxn()
  }
}
