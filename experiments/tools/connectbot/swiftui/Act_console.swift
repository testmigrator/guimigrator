import SwiftUI

struct Act_console: View {
  var body: some View {
    ZStack {
      Text("\"No hosts currently connected\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Act_console_Previews: PreviewProvider {
  static var previews: some View {
    Act_console()
  }
}
