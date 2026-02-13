import SwiftUI

struct Fragment_left_menu: View {
  var body: some View {
    ZStack {
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(width: 35.0, height: 35.0)
        .padding(.leading, 20.0)
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        Text("点击登录").font(.system(size: 16)).foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1)).padding(.leading, 10.0).frame(maxWidth: .infinity, alignment: .trailing)
        Group {
        Rectangle().foregroundColor(Image("left_menu_divider").resizable().scaledToFill())
        .frame(height: 2.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 80.0)
      Group {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 80.0)
      .padding(.bottom, 34.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).padding(10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .background(Color(red: 0.29411764705882354, green: 0.29411764705882354, blue: 0.29411764705882354, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_left_menu_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_left_menu()
  }
}
