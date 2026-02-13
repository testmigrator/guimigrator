import SwiftUI

struct Chat_pager: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      HStack(spacing: 0) {
        /* TODO: Drawer interaction (slide-in) */
        VStack {
          ScrollView {
            VStack(alignment: .leading, spacing: 0) {
              VStack(alignment: .leading, spacing: 0) {
              }
              .frame(maxWidth: .infinity)
              Button(action: { }) {
                Text("Add Account").foregroundColor(Color(red: 0.9333333333333333, green: 0.9333333333333333, blue: 0.9333333333333333, opacity: 1))
              }
              .disabled(false)
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
          }
          .background(Color(red: 0.21568627450980393, green: 0.2784313725490196, blue: 0.30980392156862746, opacity: 1))
          .frame(maxHeight: .infinity)
          .frame(width: 240.0)
        }
        .frame(width: 280)
        Divider()
        VStack {
          VStack(alignment: .leading, spacing: 0) {
            VStack(alignment: .leading, spacing: 0) {
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Chat_pager_Previews: PreviewProvider {
  static var previews: some View {
    Chat_pager()
  }
}
