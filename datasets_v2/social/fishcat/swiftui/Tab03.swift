import SwiftUI

struct Tab03: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("This is third Tab").font(.system(size: 22))
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Tab03_Previews: PreviewProvider {
  static var previews: some View {
    Tab03()
  }
}
