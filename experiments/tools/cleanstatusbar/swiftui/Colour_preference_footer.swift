import SwiftUI

struct Colour_preference_footer: View {
  var body: some View {
    Text("Add new colour").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
  }
}

struct Colour_preference_footer_Previews: PreviewProvider {
  static var previews: some View {
    Colour_preference_footer()
  }
}
