import SwiftUI

struct Debug_view: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .trailing, spacing: 0) {
      }
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxHeight: .infinity)
      .frame(width: 5.0)
      VStack(alignment: .leading, spacing: 0) {
      }
    }
  }
}

struct Debug_view_Previews: PreviewProvider {
  static var previews: some View {
    Debug_view()
  }
}
