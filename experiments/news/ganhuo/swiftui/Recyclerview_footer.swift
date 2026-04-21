import SwiftUI

struct Recyclerview_footer: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      ProgressView().frame(width: 40.0, height: 40.0)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 120.0)
  }
}

struct Recyclerview_footer_Previews: PreviewProvider {
  static var previews: some View {
    Recyclerview_footer()
  }
}
