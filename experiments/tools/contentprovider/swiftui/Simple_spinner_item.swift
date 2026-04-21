import SwiftUI

struct Simple_spinner_item: View {
  var body: some View {
    Text("").frame(maxWidth: .infinity, alignment: .leading).padding(.top, 4.0).padding(.bottom, 4.0)
  }
}

struct Simple_spinner_item_Previews: PreviewProvider {
  static var previews: some View {
    Simple_spinner_item()
  }
}
