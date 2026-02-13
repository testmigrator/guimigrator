import SwiftUI

struct Fragment_account_edit: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            Text("Changing the password").font(.system(size: 17)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 16.0)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Password", text: .constant("")).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 8.0)
            .padding(.bottom, 8.0)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("New password", text: .constant("")).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 16.0)
            .padding(.bottom, 8.0)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Password again", text: .constant("")).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.bottom, 8.0)
          }
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Change password").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .disabled(false)
          .buttonStyle(.bordered)
          .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
          .frame(maxWidth: .infinity)
          .padding(16.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Button(action: { }) {
        Text("Save").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      }
      .disabled(false)
      .buttonStyle(.borderedProminent)
      .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_account_edit_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_account_edit()
  }
}
