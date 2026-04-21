import SwiftUI

struct World_layout: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("This is the World!").font(.system(size: 20)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
      Image("world_map").resizable().scaledToFit().frame(maxHeight: .infinity).frame(width: 445.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct World_layout_Previews: PreviewProvider {
  static var previews: some View {
    World_layout()
  }
}
