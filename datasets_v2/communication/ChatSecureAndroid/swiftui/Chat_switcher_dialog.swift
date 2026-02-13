import SwiftUI

struct Chat_switcher_dialog: View {
  var body: some View {
    ZStack {
      ScrollView(.horizontal, showsIndicators: false) {
        HStack(alignment: .center, spacing: 0) {
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Image("droid_watermark").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Chat_switcher_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Chat_switcher_dialog()
  }
}
