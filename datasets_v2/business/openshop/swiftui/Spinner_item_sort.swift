import SwiftUI

struct Spinner_item_sort: View {
  var body: some View {
    Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
  }
}

struct Spinner_item_sort_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_item_sort()
  }
}
