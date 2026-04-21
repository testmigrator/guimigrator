import SwiftUI

struct Activity_about: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Text("About").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 8.0)
        Text("Hex is built to be fun, fast and pleasurable to use.nnHex is open source and available on GitHub. Hex is powered by Hex API.").frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 16.0)
        Text("Feedback").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 8.0)
        Text("If you come across any issues or have any feature requests they are most welcome here.").frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 16.0)
        Text("Contributing").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 8.0)
        Text("Contributions are always welcome. For more information please see the Contribution Guidelines.").frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity)
      .padding(16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_about_Previews: PreviewProvider {
  static var previews: some View {
    Activity_about()
  }
}
