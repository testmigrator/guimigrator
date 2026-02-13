import SwiftUI

struct Contact_grid_filter_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(0.0)
      Text("No contacts found.nnTap to invite.").font(.system(size: 24)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(0.0)
  }
}

struct Contact_grid_filter_view_Previews: PreviewProvider {
  static var previews: some View {
    Contact_grid_filter_view()
  }
}
