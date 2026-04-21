import SwiftUI

struct Activity_playback: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      ZStack {
        Spacer()
        .background(Color(red: 0, green: 0, blue: 0, opacity: 0.5333333333333333))
        ProgressView().padding(36.0).frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_playback_Previews: PreviewProvider {
  static var previews: some View {
    Activity_playback()
  }
}
