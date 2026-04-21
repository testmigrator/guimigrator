import SwiftUI

struct Dia_gatherentropy: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("\"In order to assure randomness during the key generation, move your finger randomly over the box below.\"").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color(red: 0.4, green: 0.4, blue: 1, opacity: 0.4))
      .frame(maxWidth: .infinity)
    }
  }
}

struct Dia_gatherentropy_Previews: PreviewProvider {
  static var previews: some View {
    Dia_gatherentropy()
  }
}
