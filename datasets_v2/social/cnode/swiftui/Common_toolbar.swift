import SwiftUI

struct Common_toolbar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity)
    .frame(height: 50.0)
  }
}

struct Common_toolbar_Previews: PreviewProvider {
  static var previews: some View {
    Common_toolbar()
  }
}
