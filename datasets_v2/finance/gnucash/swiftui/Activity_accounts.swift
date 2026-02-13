import SwiftUI

struct Activity_accounts: View {
  var body: some View {
    HStack(spacing: 0) {
      /* TODO: Drawer interaction (slide-in) */
      VStack {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxHeight: .infinity)
      }
      .frame(width: 280)
      Divider()
      VStack {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            ZStack {
              VStack(alignment: .leading, spacing: 0) {
              }
              .background(Color.clear)
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 0) {
            }
            .background(Color.clear)
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(20.0)
          }
          .frame(maxWidth: .infinity, alignment: .trailing)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_accounts_Previews: PreviewProvider {
  static var previews: some View {
    Activity_accounts()
  }
}
