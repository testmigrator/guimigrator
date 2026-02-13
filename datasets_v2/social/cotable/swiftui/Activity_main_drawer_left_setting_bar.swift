import SwiftUI

struct Activity_main_drawer_left_setting_bar: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Image("btn_menu_options_normal").resizable().scaledToFit().frame(width: 25.0, height: 25.0)
        Text("Settings").font(.system(size: 10)).foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 6.0)
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(8.0)
      VStack(alignment: .leading, spacing: 0) {
        Image("btn_menu_about_normal").resizable().scaledToFit().frame(width: 25.0, height: 25.0)
        Text("About").font(.system(size: 10)).foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 6.0)
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(8.0)
      VStack(alignment: .leading, spacing: 0) {
        Image("btn_menu_close_normal").resizable().scaledToFit().frame(width: 25.0, height: 25.0)
        Text("Exit").font(.system(size: 10)).foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 6.0)
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_drawer_left_setting_bar_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main_drawer_left_setting_bar()
  }
}
