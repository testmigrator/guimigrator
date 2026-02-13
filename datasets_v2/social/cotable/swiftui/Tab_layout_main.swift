import SwiftUI

struct Tab_layout_main: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      ZStack {
        Text("").font(.system(size: 15)).foregroundColor(Color(red: 0.20784313725490197, green: 0.20784313725490197, blue: 0.20784313725490197, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
  }
}

struct Tab_layout_main_Previews: PreviewProvider {
  static var previews: some View {
    Tab_layout_main()
  }
}
