import SwiftUI

struct Spinner_item_product_color: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Image("rounded_color_drawable").resizable().scaledToFill())
        .frame(width: 30.0, height: 30.0)
        .padding(4.0)
      }
      .background(Image("oval_stroke").resizable().scaledToFill())
      .padding(2.0)
      Text("").multilineTextAlignment(.center).padding(3.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 1.0)
    .padding(.top, 2.0)
    .padding(.bottom, 1.0)
  }
}

struct Spinner_item_product_color_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_item_product_color()
  }
}
