import SwiftUI

struct Dia_keyboard_shortcuts: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Ctrl-Shift-V")
          Text("\"Paste\"").multilineTextAlignment(.trailing).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("Ctrl and +")
          Text("\"Increase Font Size\"").multilineTextAlignment(.trailing).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("Ctrl and -")
          Text("\"Decrease Font Size\"").multilineTextAlignment(.trailing).frame(maxWidth: .infinity)
        }
      }
    }
    .frame(maxWidth: .infinity)
  }
}

struct Dia_keyboard_shortcuts_Previews: PreviewProvider {
  static var previews: some View {
    Dia_keyboard_shortcuts()
  }
}
