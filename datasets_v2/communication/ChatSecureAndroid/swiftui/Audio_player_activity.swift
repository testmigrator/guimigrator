import SwiftUI

struct Audio_player_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Filename Here").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 20.0)
      Button(action: { }) {
        Text("Play")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      .padding(.top, 5.0)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Audio_player_activity_Previews: PreviewProvider {
  static var previews: some View {
    Audio_player_activity()
  }
}
