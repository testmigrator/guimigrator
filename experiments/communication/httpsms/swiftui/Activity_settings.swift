import SwiftUI

struct Activity_settings: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
        .frame(maxWidth: .infinity)
        .padding(.bottom, 676.0)
      }
      .frame(maxWidth: .infinity)
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 8) {
            Text("SIM1")
            TextField("", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 48.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 8) {
            Text("SIM2")
            TextField("", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 8) {
            Text("Encryption Key")
            TextField("", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          .padding(10.0)
          .padding(.bottom, 24.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_settings_Previews: PreviewProvider {
  static var previews: some View {
    Activity_settings()
  }
}
