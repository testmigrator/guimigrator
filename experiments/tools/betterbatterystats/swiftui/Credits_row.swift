import SwiftUI

struct Credits_row: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Title").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
      Text("Author").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      Text("License").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 2.0)
    .padding(.bottom, 2.0)
  }
}

struct Credits_row_Previews: PreviewProvider {
  static var previews: some View {
    Credits_row()
  }
}
