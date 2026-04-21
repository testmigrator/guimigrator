import SwiftUI

struct Activity_main_drawer_left_list_group: View {
  var body: some View {
    ZStack {
      Text("Blog").font(.system(size: 14)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 48.0)
  }
}

struct Activity_main_drawer_left_list_group_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main_drawer_left_list_group()
  }
}
