import SwiftUI

struct Webview: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ProgressView().frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Webview_Previews: PreviewProvider {
  static var previews: some View {
    Webview()
  }
}
