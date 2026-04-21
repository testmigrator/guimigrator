import SwiftUI

struct News_item: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(3.0)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("").font(.system(size: 11)).frame(maxWidth: .infinity, alignment: .leading).padding(3.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.trailing, 5.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(width: 5.0).frame(maxWidth: .infinity).frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 6.0)
    .padding(.bottom, 6.0)
  }
}

struct News_item_Previews: PreviewProvider {
  static var previews: some View {
    News_item()
  }
}
