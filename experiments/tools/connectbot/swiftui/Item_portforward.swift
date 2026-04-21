import SwiftUI

struct Item_portforward: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Tunnel Nickname").padding(.top, 20.0)
      Text("Local port 8080 to 192.168.1.1:80").padding(.bottom, 20.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.leading, 16.0)
  }
}

struct Item_portforward_Previews: PreviewProvider {
  static var previews: some View {
    Item_portforward()
  }
}
