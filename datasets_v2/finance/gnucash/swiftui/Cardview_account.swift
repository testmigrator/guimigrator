import SwiftUI

struct Cardview_account: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Group {
        Spacer()
        .frame(width: 5.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        VStack(alignment: .leading, spacing: 0) {
          Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
          Text("Secondary text")
        }
        .frame(maxWidth: .infinity)
        Image("ic_more_vert_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 20.0).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
        Image("ic_add_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 20.0).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        Image("ic_star_border_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 6.0).padding(.bottom, 22.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Text("$ 2000.00").font(.system(size: 18)).padding(.bottom, 4.0).padding(.trailing, 12.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 5.0)
  }
}

struct Cardview_account_Previews: PreviewProvider {
  static var previews: some View {
    Cardview_account()
  }
}
