import SwiftUI

struct Account_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Group {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          Text("").frame(maxWidth: .infinity, alignment: .leading)
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxHeight: .infinity, alignment: .center)
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        }
        .frame(maxHeight: .infinity, alignment: .center)
      }
      .frame(maxHeight: .infinity)
      .frame(maxWidth: .infinity)
      .padding(6.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Account_view_Previews: PreviewProvider {
  static var previews: some View {
    Account_view()
  }
}
