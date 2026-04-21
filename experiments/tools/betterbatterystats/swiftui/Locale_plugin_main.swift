import SwiftUI

struct Locale_plugin_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Save a Custom Reference").frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      Text("Save a Text Dumpfile").frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      Text("Stat Type").frame(maxWidth: .infinity, alignment: .leading)
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Locale_plugin_main_Previews: PreviewProvider {
  static var previews: some View {
    Locale_plugin_main()
  }
}
