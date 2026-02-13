import SwiftUI

struct Empty_contact_group_view: View {
  var body: some View {
    Text("Empty").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
  }
}

struct Empty_contact_group_view_Previews: PreviewProvider {
  static var previews: some View {
    Empty_contact_group_view()
  }
}
