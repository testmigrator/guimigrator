import SwiftUI

struct Widget_detail: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("No data available.").foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      ZStack {
        Text("Habito").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.leading, 16.0).padding(.trailing, 0.0).frame(maxWidth: .infinity, alignment: .leading)
      }
      .background(Color(red: 0.12941176470588237, green: 0.5882352941176471, blue: 0.9529411764705882, opacity: 1))
      .frame(maxWidth: .infinity)
      .frame(height: 64.0)
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
      .padding(.bottom, 8.0)
    }
    .background(Color(red: 0.7333333333333333, green: 0.8705882352941177, blue: 0.984313725490196, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Widget_detail_Previews: PreviewProvider {
  static var previews: some View {
    Widget_detail()
  }
}
