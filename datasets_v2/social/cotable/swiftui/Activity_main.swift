import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(spacing: 0) {
        /* TODO: Drawer interaction (slide-in) */
        VStack {
          VStack(alignment: .leading, spacing: 0) {
            ZStack {
              VStack(alignment: .leading, spacing: 0) {
              }
              .frame(width: 70.0, height: 70.0)
              .padding(.leading, 20.0)
              .padding(.top, 35.0)
              Text("激荡的天石").font(.system(size: 15)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.leading, 20.0).padding(.bottom, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
            }
            .frame(maxWidth: .infinity)
            .frame(height: 160.0)
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
            .frame(maxWidth: .infinity)
            .padding(.top, 8.0)
            VStack(alignment: .leading, spacing: 0) {
              Rectangle().foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1))
              .background(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1))
              .frame(height: 1.0)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
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
          .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(width: 280)
        Divider()
        VStack {
          ZStack {
            VStack(alignment: .leading, spacing: 0) {
              VStack(alignment: .leading, spacing: 0) {
              }
              .background(Color(red: 0.12941176470588237, green: 0.5882352941176471, blue: 0.9529411764705882, opacity: 1))
              .frame(maxWidth: .infinity)
              VStack(alignment: .leading, spacing: 0) {
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
