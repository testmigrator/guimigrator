import SwiftUI

struct Contact_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        VStack(alignment: .leading, spacing: 0) {
        }
        Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity).padding(3.0)
        Image(systemName: "photo").resizable().scaledToFill().frame(width: 24.0, height: 24.0).padding(3.0).padding(.top, -32.0).frame(maxWidth: .infinity, alignment: .trailing)
      }
      .frame(maxWidth: .infinity)
      .padding(0.0)
      .padding(.leading, 62.0)
    }
    .frame(maxWidth: .infinity)
    .padding(3.0)
  }
}

struct Contact_view_Previews: PreviewProvider {
  static var previews: some View {
    Contact_view()
  }
}
