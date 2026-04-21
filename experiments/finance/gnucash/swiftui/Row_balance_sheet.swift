import SwiftUI

struct Row_balance_sheet: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("Credit Card").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Text("$ 2,500").font(.system(size: 14)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
    }
  }
}

struct Row_balance_sheet_Previews: PreviewProvider {
  static var previews: some View {
    Row_balance_sheet()
  }
}
