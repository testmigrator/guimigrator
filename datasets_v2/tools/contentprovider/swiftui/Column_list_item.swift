import SwiftUI

struct Column_list_item: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("").padding(.trailing, 4.0)
          Text("")
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("Type:").padding(.trailing, 4.0)
          Text("")
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(.leading, 6.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity)
    .padding(5.0)
  }
}

struct Column_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Column_list_item()
  }
}
