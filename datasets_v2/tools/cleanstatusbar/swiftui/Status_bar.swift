import SwiftUI

struct Status_bar: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo")
      Image(systemName: "photo").padding(.trailing, -6.0)
      Image(systemName: "photo")
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(width: 8.0, height: 14.5)
      .padding(.top, 0.333)
      .padding(.bottom, 0.5)
      .padding(.leading, 4.0)
      Text("12:00").foregroundColor(Color(red: 0.796078431372549, green: 0.796078431372549, blue: 0.796078431372549, opacity: 0.996078431372549)).padding(.leading, 6.5)
    }
  }
}

struct Status_bar_Previews: PreviewProvider {
  static var previews: some View {
    Status_bar()
  }
}
