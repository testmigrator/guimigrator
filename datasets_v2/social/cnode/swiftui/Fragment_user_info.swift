import SwiftUI

struct Fragment_user_info: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(width: 45.0, height: 45.0)
        .padding(.leading, 20.0)
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1)).padding(.leading, 10.0).frame(maxWidth: .infinity, alignment: .trailing)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 80.0)
      ZStack {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        .frame(height: 40.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .padding(.top, 40.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_user_info_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_user_info()
  }
}
