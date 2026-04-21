import SwiftUI

struct Package_info_row: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        Text("Name").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
        VStack(alignment: .leading, spacing: 0) {
          Text("Description").font(.system(size: 13)).frame(maxWidth: .infinity)
          Text("Permission").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 4.0)
    .padding(.bottom, 4.0)
  }
}

struct Package_info_row_Previews: PreviewProvider {
  static var previews: some View {
    Package_info_row()
  }
}
