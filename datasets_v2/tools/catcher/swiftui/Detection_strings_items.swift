import SwiftUI

struct Detection_strings_items: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("String: ").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("Type: ").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .background(Image("layer_card_background").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Detection_strings_items_Previews: PreviewProvider {
  static var previews: some View {
    Detection_strings_items()
  }
}
