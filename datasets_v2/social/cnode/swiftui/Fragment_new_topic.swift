import SwiftUI

struct Fragment_new_topic: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          TextField("请输入标题（10个字以上）", text: .constant("")).background(Image("round_corner_border").resizable().scaledToFill()).frame(maxWidth: .infinity).padding(8.0)
          TextField("请输入内容", text: .constant("")).background(Image("round_corner_border").resizable().scaledToFill()).frame(maxWidth: .infinity).padding(8.0).padding(.top, 10.0)
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 50.0)
      HStack(alignment: .center, spacing: 0) {
        HStack(alignment: .leading, spacing: 8) {
          /* TODO: RadioButton -> Toggle fallback */
          Toggle("问答", isOn: .constant(false)).frame(maxHeight: .infinity).padding(.leading, 10.0).padding(.trailing, 10.0)
          /* TODO: RadioButton -> Toggle fallback */
          Toggle("分享", isOn: .constant(false)).frame(maxHeight: .infinity).padding(.leading, 10.0).padding(.trailing, 10.0)
          /* TODO: RadioButton -> Toggle fallback */
          Toggle("招聘", isOn: .constant(false)).frame(maxHeight: .infinity).padding(.leading, 10.0).padding(.trailing, 10.0)
        }
        .frame(maxHeight: .infinity)
        Color.clear
        .background(Color(red: 0.803921568627451, green: 0.803921568627451, blue: 0.803921568627451, opacity: 1))
        .frame(width: 1.0)
        Text("确定").font(.system(size: 16)).multilineTextAlignment(.center).background(Image("btn_common_bg").resizable().scaledToFill()).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.top, 0.5)
      }
      .background(Image("rect_border").resizable().scaledToFill())
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_new_topic_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_new_topic()
  }
}
