import SwiftUI

struct Missing_chat_file_store: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("Chat Media Store Missing").multilineTextAlignment(.center).padding(20.0).frame(maxWidth: .infinity, alignment: .center)
        Text("Your chat logs are stored on the SD Card, but the file is missing from the current SD Card.  Please insert the correct SD Card, or delete the existing chat log and launch ChatSecure again.").frame(maxWidth: .infinity, alignment: .center)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Delete Chat Log")
          }
          .disabled(false)
          Button(action: { }) {
            Text("Shutdown & Lock")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(12.0)
      }
      .frame(maxWidth: .infinity)
      .padding(12.0)
    }
    .background(Color(red: 0.8, green: 0, blue: 0, opacity: 0.8))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Missing_chat_file_store_Previews: PreviewProvider {
  static var previews: some View {
    Missing_chat_file_store()
  }
}
