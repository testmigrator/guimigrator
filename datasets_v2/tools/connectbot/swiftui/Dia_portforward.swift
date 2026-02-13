import SwiftUI

struct Dia_portforward: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("\"Nickname:\"").multilineTextAlignment(.center)
          TextField("Internal Webserver", text: .constant("")).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("\"Type:\"").multilineTextAlignment(.center)
          Picker("", selection: .constant(0)) {
            Text("\"Type:\"").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("\"Source port:\"").multilineTextAlignment(.center)
          TextField("8080", text: .constant("")).frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("\"Destination:\"").multilineTextAlignment(.center)
          TextField("localhost:80", text: .constant("")).frame(maxWidth: .infinity)
        }
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dia_portforward_Previews: PreviewProvider {
  static var previews: some View {
    Dia_portforward()
  }
}
