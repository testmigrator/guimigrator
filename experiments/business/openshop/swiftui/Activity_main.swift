import SwiftUI

struct Activity_main: View {
  var body: some View {
    HStack(spacing: 0) {
      /* TODO: Drawer interaction (slide-in) */
      VStack {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxHeight: .infinity)
        .frame(width: 290.0)
      }
      .frame(width: 280)
      Divider()
      VStack {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
          }
          .background(Color.clear)
          .frame(maxWidth: .infinity)
          ZStack {
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
