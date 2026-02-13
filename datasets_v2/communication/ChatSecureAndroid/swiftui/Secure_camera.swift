import SwiftUI

struct Secure_camera: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Group {
      VStack(alignment: .leading, spacing: 0) {
        Group {
        Button(action: { }) {
          Text("")
        }
        .disabled(false)
        .background(Image("camera_button_inactive").resizable().scaledToFill())
        .frame(width: 82.0, height: 82.0)
        }
        .frame(maxWidth: .infinity, alignment: .center)
      }
      .background(Color(red: 0, green: 0, blue: 0, opacity: 0.7019607843137254))
      .frame(maxWidth: .infinity)
      .padding(20.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Secure_camera_Previews: PreviewProvider {
  static var previews: some View {
    Secure_camera()
  }
}
