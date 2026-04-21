import SwiftUI

struct Message_view_right: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Group {
      VStack(alignment: .trailing, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(6.0)
        Text("").font(.system(size: 10)).multilineTextAlignment(.trailing).frame(width: 160.0).padding(6.0)
      }
      .background(Image("message_view_rounded_light").resizable().scaledToFill())
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity)
    .padding(3.0)
    .padding(6.0)
  }
}

struct Message_view_right_Previews: PreviewProvider {
  static var previews: some View {
    Message_view_right()
  }
}
