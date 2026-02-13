import SwiftUI

struct Fragment_licenses: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          Text("Website: github.com/dkim0419/SoundRecorder").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading)
          Text("").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
          Text("").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading)
          Text("").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
          Text("").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
          Text("").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading)
          Text("").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 10.0)
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 10.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 10.0)
  }
}

struct Fragment_licenses_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_licenses()
  }
}
