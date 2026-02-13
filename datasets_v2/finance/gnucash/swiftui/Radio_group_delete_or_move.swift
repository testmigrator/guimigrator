import SwiftUI

struct Radio_group_delete_or_move: View {
  var body: some View {
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
  }
}

struct Radio_group_delete_or_move_Previews: PreviewProvider {
  static var previews: some View {
    Radio_group_delete_or_move()
  }
}
