import SwiftUI

struct Fragment_settings: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("Select the country n where you want to shop ").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
        .frame(maxWidth: .infinity)
        .padding(.top, 8.0)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Text("Open source libraries").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("License details for open source software").font(.system(size: 15)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      .padding(.bottom, 16.0)
      VStack(alignment: .leading, spacing: 0) {
        Text("Privacy policy").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("Basic information about Privacy Policy").font(.system(size: 15)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      .padding(.bottom, 16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
  }
}

struct Fragment_settings_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_settings()
  }
}
