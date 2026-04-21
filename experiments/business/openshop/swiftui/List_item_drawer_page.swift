import SwiftUI

struct List_item_drawer_page: View {
  var body: some View {
    ZStack {
      Text("").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 15.0).padding(.trailing, 4.0).padding(.top, 12.0).padding(.bottom, 12.0)
      Spacer()
      .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
    }
    .background(Color(red: 0.7058823529411765, green: 0.7058823529411765, blue: 0.7058823529411765, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct List_item_drawer_page_Previews: PreviewProvider {
  static var previews: some View {
    List_item_drawer_page()
  }
}
