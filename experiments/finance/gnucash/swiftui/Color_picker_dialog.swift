import SwiftUI

struct Color_picker_dialog: View {
  var body: some View {
    ScrollView {
      ZStack {
        ProgressView().frame(maxWidth: .infinity, alignment: .center)
      }
      .padding(28.0)
    }
  }
}

struct Color_picker_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Color_picker_dialog()
  }
}
