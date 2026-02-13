import SwiftUI

struct Activity_edit_btc: View {
  var body: some View {
    ZStack {
      TextField("", text: .constant("")).frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .background(Image("gradient").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_edit_btc_Previews: PreviewProvider {
  static var previews: some View {
    Activity_edit_btc()
  }
}
