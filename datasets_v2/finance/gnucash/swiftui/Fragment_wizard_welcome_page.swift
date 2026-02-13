import SwiftUI

struct Fragment_wizard_welcome_page: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("Welcome to GnuCash")
      Text("Before you dive in, nlet's setup a few things firstnnTo continue, press Next").font(.system(size: 24)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 12.0)
    }
  }
}

struct Fragment_wizard_welcome_page_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_wizard_welcome_page()
  }
}
