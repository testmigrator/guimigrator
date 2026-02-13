import SwiftUI

struct Dialog_rate: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("为AnimeTaste给个五星吧！")
      HStack(alignment: .center, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(20.0)
  }
}

struct Dialog_rate_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_rate()
  }
}
