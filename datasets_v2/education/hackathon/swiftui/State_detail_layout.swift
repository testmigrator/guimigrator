import SwiftUI

struct State_detail_layout: View {
  var body: some View {
    ZStack {
      Image("rsz_scroll_new").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
      Text("New Text").font(.system(size: 40)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.leading, 70.0).padding(.top, 140.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("New Text").font(.system(size: 17)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.leading, 70.0).padding(.top, 20.0).padding(.top, 180.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("New Text").font(.system(size: 17)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.top, 10.0).padding(.leading, 70.0).padding(.top, 37.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("New Text").font(.system(size: 17)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.top, 10.0).padding(.top, 27.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("New Text").font(.system(size: 17)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.top, 10.0).padding(.top, 27.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct State_detail_layout_Previews: PreviewProvider {
  static var previews: some View {
    State_detail_layout()
  }
}
