import SwiftUI

struct Changelog_row: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Title").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity)
    .padding(.top, 8.0)
    .padding(.bottom, 8.0)
  }
}

struct Changelog_row_Previews: PreviewProvider {
  static var previews: some View {
    Changelog_row()
  }
}
