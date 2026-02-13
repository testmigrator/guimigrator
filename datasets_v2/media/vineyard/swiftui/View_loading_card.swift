import SwiftUI

struct View_loading_card: View {
  var body: some View {
    ZStack {
      ProgressView().padding(36.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct View_loading_card_Previews: PreviewProvider {
  static var previews: some View {
    View_loading_card()
  }
}
