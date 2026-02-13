import SwiftUI

struct List_item_drawer_category: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("Just arrived").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.leading, 15.0).padding(.trailing, 4.0).padding(.top, 12.0).padding(.bottom, 12.0)
        Image("arrow_right_black").padding(.trailing, 12.0).frame(maxHeight: .infinity, alignment: .center)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .padding(.bottom, 5.0)
      Rectangle().foregroundColor(Color(red: 0.8705882352941177, green: 0.8705882352941177, blue: 0.8705882352941177, opacity: 1))
      .background(Color(red: 0.8705882352941177, green: 0.8705882352941177, blue: 0.8705882352941177, opacity: 1))
      .frame(height: 2.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_drawer_category_Previews: PreviewProvider {
  static var previews: some View {
    List_item_drawer_category()
  }
}
