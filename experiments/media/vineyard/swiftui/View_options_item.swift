import SwiftUI

struct View_options_item: View {
  var body: some View {
    ZStack {
      Group {
      ZStack {
        Image(systemName: "photo").frame(maxWidth: .infinity, alignment: .center)
      }
      .background(Color(red: 0, green: 0.4745098039215686, blue: 0.4196078431372549, opacity: 1))
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
        Text("").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1))
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 0.8666666666666667))
      }
      .background(Color(red: 0, green: 0.5882352941176471, blue: 0.5333333333333333, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct View_options_item_Previews: PreviewProvider {
  static var previews: some View {
    View_options_item()
  }
}
