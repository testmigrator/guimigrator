import SwiftUI

struct Finish_register_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        VStack(alignment: .leading, spacing: 0) {
          ZStack {
            Text("Thanks! The register has been correctly completed").padding(.top, 16.0).padding(.bottom, 16.0).padding(.leading, 16.0).padding(.trailing, 16.0)
          }
          .background(Image("border").resizable().scaledToFill())
          .frame(maxWidth: .infinity)
          .padding(.top, 16.0)
          .padding(.bottom, 16.0)
          Button(action: { }) {
            Text("START")
          }
          .disabled(false)
          .padding(.top, 80.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 50.0)
        .padding(.bottom, 50.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Finish_register_activity_Previews: PreviewProvider {
  static var previews: some View {
    Finish_register_activity()
  }
}
