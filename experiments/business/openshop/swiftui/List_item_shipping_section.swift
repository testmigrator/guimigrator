import SwiftUI

struct List_item_shipping_section: View {
  var body: some View {
    ZStack {
      Text("Personal pickup").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).padding(.top, 24.0).padding(.bottom, 2.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_shipping_section_Previews: PreviewProvider {
  static var previews: some View {
    List_item_shipping_section()
  }
}
