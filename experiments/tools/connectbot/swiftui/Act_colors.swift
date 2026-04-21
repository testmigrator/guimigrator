import SwiftUI

struct Act_colors: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .frame(maxWidth: .infinity)
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
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(10.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Act_colors_Previews: PreviewProvider {
  static var previews: some View {
    Act_colors()
  }
}
