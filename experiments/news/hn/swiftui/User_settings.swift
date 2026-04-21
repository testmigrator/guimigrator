import SwiftUI

struct User_settings: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("User").font(.system(size: 22)).foregroundColor(Color.black).padding(.leading, 15.0).padding(.top, 8.0).padding(.bottom, 2.0)
      Text("Username").foregroundColor(Color(red: 0.19215686274509805, green: 0.18823529411764706, blue: 0.19215686274509805, opacity: 1)).padding(.leading, 15.0).padding(.bottom, 8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct User_settings_Previews: PreviewProvider {
  static var previews: some View {
    User_settings()
  }
}
