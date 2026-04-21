import SwiftUI

struct View_checkablemenuitem: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0)
      Text("").font(.system(size: 16)).foregroundColor(Color.clear).multilineTextAlignment(.leading).padding(.top, 20.0).padding(.leading, 72.0)
      Text("").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.leading).padding(.bottom, 20.0).padding(.leading, 72.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(.trailing, 16.0)
    }
  }
}

struct View_checkablemenuitem_Previews: PreviewProvider {
  static var previews: some View {
    View_checkablemenuitem()
  }
}
