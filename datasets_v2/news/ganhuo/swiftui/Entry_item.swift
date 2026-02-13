import SwiftUI

struct Entry_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Image(systemName: "photo").resizable().scaledToFit().frame(width: 80.0, height: 80.0).padding(.trailing, 10.0).frame(maxWidth: .infinity, alignment: .leading)
        Text("").font(.system(size: 18)).foregroundColor(Color.clear).padding(.bottom, 10.0).frame(maxWidth: .infinity, alignment: .trailing)
        Text("").foregroundColor(Color.clear).padding(.top, 18.0).frame(maxWidth: .infinity, alignment: .trailing)
        Text("").foregroundColor(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 5.0)
      .padding(.bottom, 5.0)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 100.0)
    .padding(.leading, 10.0)
    .padding(.trailing, 10.0)
    .padding(.top, 5.0)
    .padding(.bottom, 5.0)
  }
}

struct Entry_item_Previews: PreviewProvider {
  static var previews: some View {
    Entry_item()
  }
}
