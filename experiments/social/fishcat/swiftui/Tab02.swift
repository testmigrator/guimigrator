import SwiftUI

struct Tab02: View {
  var body: some View {
    ZStack {
      Group {
      ZStack {
        Image(systemName: "photo").frame(maxWidth: .infinity, alignment: .leading)
        Text("我的智能设备").foregroundColor(Color.clear).padding(.leading, 20.0).frame(maxWidth: .infinity, alignment: .trailing)
        Image(systemName: "photo").padding(.trailing, 10.0).frame(maxWidth: .infinity, alignment: .trailing)
      }
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      .padding(.top, 10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Tab02_Previews: PreviewProvider {
  static var previews: some View {
    Tab02()
  }
}
