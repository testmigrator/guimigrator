import SwiftUI

struct Horizontal_line: View {
  var body: some View {
    Rectangle().foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1))
    .background(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1))
    .frame(height: 1.0)
    .padding(.top, 10.0)
    .padding(.bottom, 10.0)
  }
}

struct Horizontal_line_Previews: PreviewProvider {
  static var previews: some View {
    Horizontal_line()
  }
}
