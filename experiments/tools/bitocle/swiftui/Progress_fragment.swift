import SwiftUI

struct Progress_fragment: View {
  var body: some View {
    ZStack {
      ZStack {
        Text("").font(.system(size: 12)).foregroundColor(Color.clear).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Progress_fragment_Previews: PreviewProvider {
  static var previews: some View {
    Progress_fragment()
  }
}
