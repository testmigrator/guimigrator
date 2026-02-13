import SwiftUI

struct Activity_diagnosticsapp: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      ZStack {
        Text("Call Stack...").font(.system(size: 10)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 4.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_diagnosticsapp_Previews: PreviewProvider {
  static var previews: some View {
    Activity_diagnosticsapp()
  }
}
