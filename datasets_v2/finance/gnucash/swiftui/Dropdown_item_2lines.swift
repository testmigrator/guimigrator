import SwiftUI

struct Dropdown_item_2lines: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Transaction description").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
      Text("Amount and date")
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 5.0)
  }
}

struct Dropdown_item_2lines_Previews: PreviewProvider {
  static var previews: some View {
    Dropdown_item_2lines()
  }
}
