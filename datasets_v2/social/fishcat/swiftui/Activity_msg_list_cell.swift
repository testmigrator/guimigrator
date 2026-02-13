import SwiftUI

struct Activity_msg_list_cell: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").padding(.top, 2.0).padding(.bottom, 2.0)
      Text("").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 16.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Activity_msg_list_cell_Previews: PreviewProvider {
  static var previews: some View {
    Activity_msg_list_cell()
  }
}
