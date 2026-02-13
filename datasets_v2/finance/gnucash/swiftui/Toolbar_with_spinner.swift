import SwiftUI

struct Toolbar_with_spinner: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Toolbar_with_spinner_Previews: PreviewProvider {
  static var previews: some View {
    Toolbar_with_spinner()
  }
}
