import SwiftUI

struct List_cell_footer: View {
  var body: some View {
    ZStack {
      HStack(alignment: .center, spacing: 0) {
        ProgressView()
        Text("加载中...").font(.system(size: 16)).foregroundColor(Color(red: 0.6039215686274509, green: 0.6039215686274509, blue: 0.6039215686274509, opacity: 1))
      }
      .frame(maxWidth: .infinity)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity)
  }
}

struct List_cell_footer_Previews: PreviewProvider {
  static var previews: some View {
    List_cell_footer()
  }
}
