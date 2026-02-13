import SwiftUI

struct Activity_main_drawer_left_divider: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Rectangle().foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1))
      .background(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1))
      .frame(height: 1.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_drawer_left_divider_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main_drawer_left_divider()
  }
}
