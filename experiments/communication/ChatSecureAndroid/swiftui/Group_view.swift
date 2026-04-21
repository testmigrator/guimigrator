import SwiftUI

struct Group_view: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("").frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
      Text("").frame(maxHeight: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Group_view_Previews: PreviewProvider {
  static var previews: some View {
    Group_view()
  }
}
