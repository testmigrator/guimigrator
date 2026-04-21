import SwiftUI

struct View_toolbar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
    }
    .background(Color(red: 0.12941176470588237, green: 0.5882352941176471, blue: 0.9529411764705882, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct View_toolbar_Previews: PreviewProvider {
  static var previews: some View {
    View_toolbar()
  }
}
