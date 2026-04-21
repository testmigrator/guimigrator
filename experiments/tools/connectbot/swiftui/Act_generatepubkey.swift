import SwiftUI

struct Act_generatepubkey: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("\"Nickname:\"").multilineTextAlignment(.center)
          TextField("\"My work key\"", text: .constant("")).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("\"Type:\"").multilineTextAlignment(.trailing).frame(maxHeight: .infinity, alignment: .center)
          VStack(alignment: .leading, spacing: 8) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("RSA", isOn: .constant(false))
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("DSA", isOn: .constant(false))
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("EC", isOn: .constant(false))
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("Ed25519", isOn: .constant(false))
          }
        }
        HStack(alignment: .center, spacing: 0) {
          Text("\"Bits:\"").multilineTextAlignment(.center)
          TextField("", text: .constant("")).frame(maxWidth: .infinity)
        }
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        Text("\"Note: password can be blank\"").multilineTextAlignment(.leading)
        HStack(alignment: .center, spacing: 0) {
          Text("\"Password:\"").multilineTextAlignment(.center)
          TextField("", text: .constant("")).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .trailing, spacing: 0) {
            Spacer()
            Text("\"Password:\"").multilineTextAlignment(.trailing)
            Text("\"(again)\"").multilineTextAlignment(.trailing)
            Spacer()
          }
          TextField("", text: .constant("")).frame(maxWidth: .infinity)
        }
        VStack(alignment: .leading, spacing: 0) {
        }
        VStack(alignment: .leading, spacing: 0) {
        }
        Button(action: { }) {
          Text("\"Generate\"")
        }
        .disabled(true)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Act_generatepubkey_Previews: PreviewProvider {
  static var previews: some View {
    Act_generatepubkey()
  }
}
