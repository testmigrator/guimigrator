import SwiftUI

struct Memo_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 5.0)
          .frame(maxWidth: .infinity)
          Image("icon_upload").resizable().scaledToFit().frame(width: 22.0, height: 22.0)
        }
        .frame(maxWidth: .infinity)
        Text("@null").font(.system(size: 12)).foregroundColor(Color(red: 0.6941176470588235, green: 0.6941176470588235, blue: 0.6941176470588235, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(height: 20.0).padding(.top, 5.0)
      }
      .background(Image("hover_border_normal").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .padding(.top, 5.0)
      .padding(.bottom, 5.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(3.0)
  }
}

struct Memo_item_Previews: PreviewProvider {
  static var previews: some View {
    Memo_item()
  }
}
