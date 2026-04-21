import SwiftUI

struct View_toast: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Group {
      ZStack {
        Text("TOAST MESSAGE").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 0.12941176470588237, green: 0.5882352941176471, blue: 0.9529411764705882, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct View_toast_Previews: PreviewProvider {
  static var previews: some View {
    View_toast()
  }
}
