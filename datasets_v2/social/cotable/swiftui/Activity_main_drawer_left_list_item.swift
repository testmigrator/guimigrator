import SwiftUI

struct Activity_main_drawer_left_list_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(height: 48.0)
      .padding(.leading, 24.0)
      Text("About").font(.system(size: 16)).foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(height: 48.0).padding(.leading, 42.0)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity)
    .frame(height: 48.0)
  }
}

struct Activity_main_drawer_left_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main_drawer_left_list_item()
  }
}
