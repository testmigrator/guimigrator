import SwiftUI

struct Activity_login: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 100.0, height: 100.0).padding(.top, 32.0)
      Text("Opennhttpsms.com/settingsnto get your API key").font(.system(size: 20)).multilineTextAlignment(.center).padding(.bottom, 20.0)
      VStack(alignment: .leading, spacing: 8) {
        Text("API Key")
        TextField("", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 8) {
        Text("Phone number (SIM1)")
        TextField("", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 224.0)
      VStack(alignment: .leading, spacing: 8) {
        Text("Phone number (SIM2)")
        TextField("", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 224.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 8) {
          Text("Server URL")
          TextField("", text: .constant("")).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(10.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_login_Previews: PreviewProvider {
  static var previews: some View {
    Activity_login()
  }
}
