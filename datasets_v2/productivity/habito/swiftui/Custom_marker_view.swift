import SwiftUI

struct Custom_marker_view: View {
  var body: some View {
    ZStack {
      Text("").font(.system(size: 12)).foregroundColor(Color.white).padding(.leading, 5.0).padding(.trailing, 5.0).padding(.top, 7.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }
    .background(Image("marker_view").resizable().scaledToFill())
    .frame(height: 40.0)
  }
}

struct Custom_marker_view_Previews: PreviewProvider {
  static var previews: some View {
    Custom_marker_view()
  }
}
