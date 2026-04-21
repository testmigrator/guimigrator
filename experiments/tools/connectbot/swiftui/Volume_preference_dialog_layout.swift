import SwiftUI

struct Volume_preference_dialog_layout: View {
  var body: some View {
    ScrollView {
      HStack(alignment: .center, spacing: 0) {
        Image("ic_volume_up").resizable().scaledToFit().frame(width: 36.0, height: 36.0).padding(.top, 24.0).padding(.bottom, 18.0)
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxHeight: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 18.0)
      .padding(.bottom, 18.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 48.0)
    .padding(.bottom, 48.0)
  }
}

struct Volume_preference_dialog_layout_Previews: PreviewProvider {
  static var previews: some View {
    Volume_preference_dialog_layout()
  }
}
