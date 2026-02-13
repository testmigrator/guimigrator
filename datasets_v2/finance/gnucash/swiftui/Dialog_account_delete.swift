import SwiftUI

struct Dialog_account_delete: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 8) {
        Text("Transactions")
        Text("This account contains transactions. \\nWhat would you like to do with these transactions").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading)
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("Delete sub-accounts", isOn: .constant(false)).frame(maxWidth: .infinity, maxHeight: .infinity)
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("Move to:", isOn: .constant(false))
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
      VStack(alignment: .leading, spacing: 8) {
        Text("Transactions")
        Text("This account contains transactions. \\nWhat would you like to do with these transactions").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading)
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("Delete sub-accounts", isOn: .constant(false)).frame(maxWidth: .infinity, maxHeight: .infinity)
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("Move to:", isOn: .constant(false))
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
      VStack(alignment: .leading, spacing: 0) {
        Spacer()
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Cancel").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Save").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 5.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_account_delete_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_account_delete()
  }
}
