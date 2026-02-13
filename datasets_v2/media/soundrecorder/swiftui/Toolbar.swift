import SwiftUI

struct Toolbar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
    }
    .background(Color(red: 0.9568627450980393, green: 0.2627450980392157, blue: 0.21176470588235294, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct Toolbar_Previews: PreviewProvider {
  static var previews: some View {
    Toolbar()
  }
}
