import SwiftUI

struct Item_cell_info_overview: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("").font(.system(size: 18)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
          Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).multilineTextAlignment(.leading)
        }
        HStack(alignment: .center, spacing: 0) {
          Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
        }
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Item_cell_info_overview_Previews: PreviewProvider {
  static var previews: some View {
    Item_cell_info_overview()
  }
}
