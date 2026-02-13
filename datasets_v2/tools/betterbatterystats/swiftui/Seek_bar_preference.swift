import SwiftUI

struct Seek_bar_preference: View {
  var body: some View {
    ZStack {
      Text("").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("").multilineTextAlignment(.trailing).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 5.0)
    .padding(.bottom, 5.0)
  }
}

struct Seek_bar_preference_Previews: PreviewProvider {
  static var previews: some View {
    Seek_bar_preference()
  }
}
