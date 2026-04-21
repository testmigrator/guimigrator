import SwiftUI

struct Fragment_page: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("").font(.system(size: 20)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 16.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_page_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_page()
  }
}
