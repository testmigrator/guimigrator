import SwiftUI

struct Dialog_flex_content: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_flex_content_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_flex_content()
  }
}
