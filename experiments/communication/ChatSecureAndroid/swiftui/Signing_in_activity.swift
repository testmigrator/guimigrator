import SwiftUI

struct Signing_in_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Spacer()
      HStack(alignment: .center, spacing: 0) {
        Text("Signing inu2026")
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 20.0)
      HStack(alignment: .center, spacing: 0) {
        ProgressView()
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 5.0)
      Group {
      ZStack {
        Image("logo_poweredby").resizable().scaledToFit().frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Spacer()
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Signing_in_activity_Previews: PreviewProvider {
  static var previews: some View {
    Signing_in_activity()
  }
}
