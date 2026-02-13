import SwiftUI

struct Web_proxy_dialog: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      TextField("Proxy hostname or IP", text: .constant("")).frame(maxWidth: .infinity)
      TextField("Proxy port", text: .constant("")).frame(maxWidth: .infinity)
      TextField("Proxy username", text: .constant("")).frame(maxWidth: .infinity)
      TextField("Proxy password", text: .constant("")).frame(maxWidth: .infinity)
      Text("Proxy Type").font(.system(size: 18)).foregroundColor(Color(red: 0.1568627450980392, green: 0.1568627450980392, blue: 0.1568627450980392, opacity: 0.39215686274509803)).frame(maxWidth: .infinity, alignment: .leading).padding(5.0).padding(.top, 16.0)
      HStack(alignment: .leading, spacing: 8) {
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("HTTP", isOn: .constant(false))
        /* TODO: RadioButton -> Toggle fallback */
        Toggle("SOCKS", isOn: .constant(false))
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Text("").foregroundColor(Color(red: 0.1568627450980392, green: 0.1568627450980392, blue: 0.1568627450980392, opacity: 0.39215686274509803)).frame(maxWidth: .infinity, alignment: .leading).padding(5.0).padding(.top, 16.0)
    }
    .padding(10.0)
  }
}

struct Web_proxy_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Web_proxy_dialog()
  }
}
