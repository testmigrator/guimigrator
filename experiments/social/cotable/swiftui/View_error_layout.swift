import SwiftUI

struct View_error_layout: View {
  var body: some View {
    ZStack {
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
          Group {
          ZStack {
            ProgressView().background(Image("loadingpage_bg").resizable().scaledToFill())
          }
          }
          .frame(maxWidth: .infinity, alignment: .center)
          Text("点击屏幕, 重新加载").font(.system(size: 16)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        }
        .frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct View_error_layout_Previews: PreviewProvider {
  static var previews: some View {
    View_error_layout()
  }
}
