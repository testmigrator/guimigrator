import SwiftUI

struct Tab04: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("This is 4 Tab").font(.system(size: 22))
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Tab04_Previews: PreviewProvider {
  static var previews: some View {
    Tab04()
  }
}
