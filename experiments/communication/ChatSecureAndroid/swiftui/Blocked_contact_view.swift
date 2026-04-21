import SwiftUI

struct Blocked_contact_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
        Image("ic_im_block").frame(maxWidth: .infinity, alignment: .center)
      }
      VStack(alignment: .leading, spacing: 0) {
        Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
        Text("").frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Blocked_contact_view_Previews: PreviewProvider {
  static var previews: some View {
    Blocked_contact_view()
  }
}
