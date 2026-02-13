import SwiftUI

struct Add_contact_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Account to add to:").frame(maxWidth: .infinity, alignment: .leading)
      Picker("", selection: .constant(0)) {
        Text("Account to add to:").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      Text("Username or JabberID of person to add:").frame(maxWidth: .infinity, alignment: .leading)
      /* AutoComplete requires data source (adapter) */
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Send Invite").font(.system(size: 24))
      }
      .disabled(false)
      Button(action: { }) {
        Text("Scan QR").font(.system(size: 24))
      }
      .disabled(false)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(6.0)
  }
}

struct Add_contact_activity_Previews: PreviewProvider {
  static var previews: some View {
    Add_contact_activity()
  }
}
