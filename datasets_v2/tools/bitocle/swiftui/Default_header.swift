import SwiftUI

struct Default_header: View {
  var body: some View {
    ZStack {
      ZStack {
        Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 48.0)
      ProgressView().frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Default_header_Previews: PreviewProvider {
  static var previews: some View {
    Default_header()
  }
}
