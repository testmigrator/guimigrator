import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      HStack(spacing: 0) {
        /* TODO: Drawer interaction (slide-in) */
        VStack {
          ZStack {
          }
          .frame(maxHeight: .infinity)
          .frame(width: 220.0)
        }
        .frame(width: 280)
        Divider()
        VStack {
          ZStack {
            VStack(alignment: .leading, spacing: 0) {
            }
            .background(Color.clear)
            .frame(maxWidth: .infinity)
            .frame(height: 40.0)
            VStack(alignment: .leading, spacing: 0) {
            }
            .background(Color.clear)
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .padding(.top, 40.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
