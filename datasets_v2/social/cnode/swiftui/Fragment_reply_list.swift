import SwiftUI

struct Fragment_reply_list: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      ZStack {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 50.0)
      .padding(.bottom, 45.0)
      Group {
      HStack(alignment: .center, spacing: 0) {
        ZStack {
          HStack(alignment: .center, spacing: 0) {
            Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1)).multilineTextAlignment(.center)
            TextField("请输入内容", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity).padding(5.0).frame(maxHeight: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          HStack(alignment: .bottom, spacing: 0) {
            Color.clear
            .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
            .frame(width: 1.0)
            Rectangle().foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
            .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
            .frame(height: 1.0)
            .frame(maxWidth: .infinity)
            Color.clear
            .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
            .frame(width: 1.0)
          }
          .frame(maxWidth: .infinity)
          .frame(height: 5.0)
        }
        .background(Color(red: 0.996078431372549, green: 0.996078431372549, blue: 0.996078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
        .padding(.top, 1.0)
        Color.clear
        .background(Color(red: 0.8705882352941177, green: 0.8705882352941177, blue: 0.8705882352941177, opacity: 1))
        .frame(width: 0.5)
        .padding(.top, 5.0)
        .padding(.bottom, 5.0)
        Text("确定").font(.system(size: 16)).multilineTextAlignment(.center).background(Image("btn_common_bg").resizable().scaledToFill()).padding(.top, 1.0)
      }
      .background(Image("rect_border").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_reply_list_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_reply_list()
  }
}
