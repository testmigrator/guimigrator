import SwiftUI

struct Main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("--").font(.system(size: 32))
        ZStack {
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          }
          .frame(maxWidth: .infinity, alignment: .center)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_Previews: PreviewProvider {
  static var previews: some View {
    Main()
  }
}
