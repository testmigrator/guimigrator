import SwiftUI

struct Spinner_item_sort_dropdown: View {
  var body: some View {
    Text("Popular").foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.leading).background(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 10.0).padding(.trailing, 25.0).padding(.top, 14.0).padding(.bottom, 14.0)
  }
}

struct Spinner_item_sort_dropdown_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_item_sort_dropdown()
  }
}
