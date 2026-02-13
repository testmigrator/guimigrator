import SwiftUI

struct Progress_bar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Spacer()
        Spacer()
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Spacer()
        Spacer()
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Progress_bar_Previews: PreviewProvider {
  static var previews: some View {
    Progress_bar()
  }
}
