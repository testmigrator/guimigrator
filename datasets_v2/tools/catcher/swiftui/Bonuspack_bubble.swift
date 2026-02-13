import SwiftUI

struct Bonuspack_bubble: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Title").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity)
        }
        Text("Description").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
      }
    }
  }
}

struct Bonuspack_bubble_Previews: PreviewProvider {
  static var previews: some View {
    Bonuspack_bubble()
  }
}
