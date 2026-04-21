import SwiftUI

struct Scrollingtext_buttons_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("TITLE").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          ScrollView {
            Text("this is sample text this is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample textthis is sample text").padding(6.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("button1")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("button2")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 30.0)
      }
      .frame(maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(6.0)
  }
}

struct Scrollingtext_buttons_view_Previews: PreviewProvider {
  static var previews: some View {
    Scrollingtext_buttons_view()
  }
}
