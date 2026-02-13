import SwiftUI

struct List_item_filter_range: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Price").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      HStack(alignment: .center, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_filter_range_Previews: PreviewProvider {
  static var previews: some View {
    List_item_filter_range()
  }
}
