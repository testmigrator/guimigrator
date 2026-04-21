import SwiftUI

struct Feed_details: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .center)
      Text("").frame(maxWidth: .infinity, alignment: .leading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Feed_details_Previews: PreviewProvider {
  static var previews: some View {
    Feed_details()
  }
}
