import SwiftUI

struct Fragment_setting: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      Text("设置").font(.system(size: 18)).foregroundColor(Color.clear).padding(20.0)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_setting_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_setting()
  }
}
