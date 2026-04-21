import SwiftUI

struct Spinner_item_simple_text: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("").multilineTextAlignment(.center).padding(3.0)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 1.0)
    .padding(.top, 2.0)
    .padding(.bottom, 1.0)
  }
}

struct Spinner_item_simple_text_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_item_simple_text()
  }
}
