import SwiftUI

struct Widget_preview_card: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(width: 175.0, height: 175.0)
      Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity, maxHeight: .infinity)
      Spacer()
      .background(Color(red: 0, green: 0, blue: 0, opacity: 0.4666666666666667))
      ProgressView().frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Widget_preview_card_Previews: PreviewProvider {
  static var previews: some View {
    Widget_preview_card()
  }
}
