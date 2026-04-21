import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image("panch").background(Color.clear)
      Button(action: { }) {
        Text("Start.nप्रारंभ").foregroundColor(Color(red: 1, green: 0.8941176470588236, blue: 0.8823529411764706, opacity: 1))
      }
      .disabled(false)
      .background(Color(red: 0.1803921568627451, green: 0.03137254901960784, blue: 0.32941176470588235, opacity: 1))
      .padding(.leading, 20.0)
      .padding(.trailing, 20.0)
    }
    .background(Color(red: 0.803921568627451, green: 0.7098039215686275, blue: 0.803921568627451, opacity: 0.3333333333333333))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
