import SwiftUI

struct Fragment_media_playback: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Text("file_name.mp4").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 10.0).padding(.top, 7.0).padding(.bottom, 7.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(maxWidth: .infinity)
          ZStack {
            Text("00:00").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            Group {
            VStack(alignment: .leading, spacing: 0) {
            }
            .padding(.top, 10.0)
            .padding(.bottom, 10.0)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
            Text("00:00").padding(.trailing, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          }
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(7.0)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Fragment_media_playback_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_media_playback()
  }
}
