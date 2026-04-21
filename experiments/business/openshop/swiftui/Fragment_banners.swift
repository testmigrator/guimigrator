import SwiftUI

struct Fragment_banners: View {
  var body: some View {
    ZStack {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Group {
      VStack(alignment: .center, spacing: 0) {
        Text("No banners").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).padding(20.0)
        Text("Show offers").font(.system(size: 18)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).background(Color.clear).padding(20.0)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_banners_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_banners()
  }
}
