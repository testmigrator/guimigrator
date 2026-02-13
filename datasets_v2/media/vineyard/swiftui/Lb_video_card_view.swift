import SwiftUI

struct Lb_video_card_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      ZStack {
        ZStack {
          Text("").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 2.0).padding(.top, 2.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 2.0).padding(.bottom, 2.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 52.0)
        .padding(6.0)
      }
      .frame(maxWidth: .infinity)
    }
  }
}

struct Lb_video_card_view_Previews: PreviewProvider {
  static var previews: some View {
    Lb_video_card_view()
  }
}
