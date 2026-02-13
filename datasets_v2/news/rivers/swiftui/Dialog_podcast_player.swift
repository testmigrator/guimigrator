import SwiftUI

struct Dialog_podcast_player: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("0").frame(maxWidth: .infinity, alignment: .center)
      HStack(alignment: .center, spacing: 0) {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxHeight: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity)
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("Play")
        }
        .disabled(false)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        Button(action: { }) {
          Text("Stop")
        }
        .disabled(false)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Dialog_podcast_player_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_podcast_player()
  }
}
