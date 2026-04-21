import SwiftUI

struct Account_view_sidebar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity)
      .padding(6.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Account_view_sidebar_Previews: PreviewProvider {
  static var previews: some View {
    Account_view_sidebar()
  }
}
