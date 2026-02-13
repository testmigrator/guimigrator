import SwiftUI

struct View_tag_card: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").padding(.leading, 16.0).padding(.trailing, 0.0).padding(.top, 16.0).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .leading)
      Text("").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.leading, 16.0).padding(.trailing, 16.0).frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct View_tag_card_Previews: PreviewProvider {
  static var previews: some View {
    View_tag_card()
  }
}
