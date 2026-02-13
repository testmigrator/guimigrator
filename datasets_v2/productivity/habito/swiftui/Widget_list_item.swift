import SwiftUI

struct Widget_list_item: View {
  var body: some View {
    ZStack {
      Text("Read 10 minutes").foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).padding(.trailing, 16.0)
      Text("3").foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
  }
}

struct Widget_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Widget_list_item()
  }
}
