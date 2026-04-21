import SwiftUI

struct Cardview_book: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        VStack(alignment: .leading, spacing: 0) {
          Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
          Text("Secondary text")
        }
        .frame(maxWidth: .infinity)
        Image("ic_more_vert_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 20.0).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
        Text("Last export:").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.leading).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("Sat, 04 July").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.leading).padding(.leading, 5.0).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 5.0)
  }
}

struct Cardview_book_Previews: PreviewProvider {
  static var previews: some View {
    Cardview_book()
  }
}
