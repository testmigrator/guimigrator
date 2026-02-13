import SwiftUI

struct Activity_transaction_detail: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            Text("Transaction description which can be rather long").frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 20.0)
            Text("Expenses:Computer").foregroundColor(Color.white).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 8.0)
          }
          .frame(maxWidth: .infinity)
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        .frame(height: 128.0)
        ScrollView {
          VStack(alignment: .leading, spacing: 0) {
            HStack(alignment: .center, spacing: 0) {
              Text("Balance").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
              Text("$ 2000").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
              Text("$ 2000").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 5.0)
            .padding(.bottom, 5.0)
            .padding(.leading, 6.0)
            HStack(alignment: .center, spacing: 0) {
              Image("ic_action_time").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
              Text("").font(.system(size: 16)).foregroundColor(Color.black).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 20.0)
            .padding(.bottom, 10.0)
            HStack(alignment: .center, spacing: 0) {
              Image("ic_action_sort_by_size").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
              Text("").font(.system(size: 16)).foregroundColor(Color.black).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 10.0)
            .padding(.bottom, 10.0)
            HStack(alignment: .center, spacing: 0) {
              Image("ic_action_rotate_right").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
              Text("").font(.system(size: 16)).foregroundColor(Color.black).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 10.0)
            .padding(.bottom, 10.0)
          }
          .frame(maxWidth: .infinity)
          .padding(10.0)
          .padding(.top, 20.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(width: 40.0, height: 40.0)
      .padding(.leading, 6.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_transaction_detail_Previews: PreviewProvider {
  static var previews: some View {
    Activity_transaction_detail()
  }
}
