import SwiftUI

struct Inc_buttonbar_divider: View {
  var body: some View {
    Rectangle().foregroundColor(Color.clear)
    .background(Color.clear)
    .frame(height: 0.5)
    .padding(.top, 12.0)
  }
}

struct Inc_buttonbar_divider_Previews: PreviewProvider {
  static var previews: some View {
    Inc_buttonbar_divider()
  }
}
