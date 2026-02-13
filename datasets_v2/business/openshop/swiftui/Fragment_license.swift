import SwiftUI

struct Fragment_license: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ProgressView()
      Text("Open source libraries").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(8.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(8.0)
  }
}

struct Fragment_license_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_license()
  }
}
