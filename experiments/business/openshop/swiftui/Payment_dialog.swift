import SwiftUI

struct Payment_dialog: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Image("back_arrow").background(Color.clear)
        Text("Payment").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
      .frame(maxWidth: .infinity)
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Payment_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Payment_dialog()
  }
}
