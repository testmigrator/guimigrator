import SwiftUI

struct Drawer_section: View {
  var body: some View {
    ZStack {
      Text("").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 7.0).padding(.bottom, 7.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Drawer_section_Previews: PreviewProvider {
  static var previews: some View {
    Drawer_section()
  }
}
