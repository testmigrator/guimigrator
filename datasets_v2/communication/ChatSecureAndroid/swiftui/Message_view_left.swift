import SwiftUI

struct Message_view_left: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(6.0)
        .padding(.leading, 24.0)
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        Text("").font(.system(size: 10)).padding(6.0).padding(.leading, 24.0).padding(.bottom, 1.0)
      }
      .background(Image("message_view_rounded_light").resizable().scaledToFill())
      .padding(0.0)
      .padding(.leading, 24.0)
      .padding(.trailing, 36.0)
    }
    .frame(maxWidth: .infinity)
    .padding(3.0)
    .padding(6.0)
  }
}

struct Message_view_left_Previews: PreviewProvider {
  static var previews: some View {
    Message_view_left()
  }
}
