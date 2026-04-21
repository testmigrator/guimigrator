import SwiftUI

struct Act_help: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .center, spacing: 0) {
        Text("ConnectBot (working version)").multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
        Text("\"Please select a topic below for more information on a particular subject.\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Button(action: { }) {
          Text("\"Hints\"")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("\"Keyboard Shortcuts\"")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("\"Terms & Conditions\"")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Act_help_Previews: PreviewProvider {
  static var previews: some View {
    Act_help()
  }
}
