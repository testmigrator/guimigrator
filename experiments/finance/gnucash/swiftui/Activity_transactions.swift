import SwiftUI

struct Activity_transactions: View {
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
                Picker("", selection: .constant(0)) {
                  Text("Select").tag(0)
                  Text("Option 1").tag(1)
                  Text("Option 2").tag(2)
                  Text("Option 3").tag(3)
                }
                .pickerStyle(.menu)
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
          .frame(maxWidth: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("Balance:").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.leading, 12.0)
            Text("").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center).padding(.trailing, 12.0)
          }
          .background(Image("abc_ab_share_pack_mtrl_alpha").resizable().scaledToFill())
          .frame(maxWidth: .infinity)
          .padding(.top, 8.0)
          .padding(.bottom, 8.0)
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

struct Activity_transactions_Previews: PreviewProvider {
  static var previews: some View {
    Activity_transactions()
  }
}
