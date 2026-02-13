import SwiftUI

struct Fragment_details_container: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
        .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_details_container_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_details_container()
  }
}
