import SwiftUI

struct Fragment_disclaimer: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Disclaimer").font(.system(size: 20)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
      ScrollView {
        VStack(alignment: .center, spacing: 0) {
          Text("This application was developed by an individual who does not have any affiliation with the content providers Gives Me Hope and affiliates. This application is for educational purposes only.").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(24.0)
  }
}

struct Fragment_disclaimer_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_disclaimer()
  }
}
