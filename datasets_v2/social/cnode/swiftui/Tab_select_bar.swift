import SwiftUI

struct Tab_select_bar: View {
  var body: some View {
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
}

struct Tab_select_bar_Previews: PreviewProvider {
  static var previews: some View {
    Tab_select_bar()
  }
}
