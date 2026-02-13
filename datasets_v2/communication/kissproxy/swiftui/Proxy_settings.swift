import SwiftUI

struct Proxy_settings: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Text("").font(.system(size: 18)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 10.0).padding(.bottom, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(.trailing, 12.0)
        }
        .frame(maxWidth: .infinity, alignment: .trailing)
      }
      .background(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 0.3764705882352941))
      .frame(maxWidth: .infinity)
      .frame(height: 60.0)
      Text("").frame(maxWidth: .infinity, alignment: .leading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Proxy_settings_Previews: PreviewProvider {
  static var previews: some View {
    Proxy_settings()
  }
}
