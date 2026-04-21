import SwiftUI

struct Letter: View {
  var body: some View {
    Button(action: { }) {
      Text("")
    }
    .disabled(false)
    .background(Image("letter_up").resizable().scaledToFill())
    .frame(height: 35.0)
  }
}

struct Letter_Previews: PreviewProvider {
  static var previews: some View {
    Letter()
  }
}
