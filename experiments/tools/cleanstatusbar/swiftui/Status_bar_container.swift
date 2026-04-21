import SwiftUI

struct Status_bar_container: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      .frame(height: 38.0)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Status_bar_container_Previews: PreviewProvider {
  static var previews: some View {
    Status_bar_container()
  }
}
