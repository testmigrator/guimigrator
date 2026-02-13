import SwiftUI

struct Notification_podcast_player: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxHeight: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      ZStack {
        Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Notification_podcast_player_Previews: PreviewProvider {
  static var previews: some View {
    Notification_podcast_player()
  }
}
