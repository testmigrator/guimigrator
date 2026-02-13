import SwiftUI

struct Input_line: View {
  var body: some View {
    HStack(alignment: .bottom, spacing: 0) {
      Color.clear
      .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .frame(width: 1.0)
      Rectangle().foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .frame(height: 1.0)
      .frame(maxWidth: .infinity)
      Color.clear
      .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .frame(width: 1.0)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 5.0)
  }
}

struct Input_line_Previews: PreviewProvider {
  static var previews: some View {
    Input_line()
  }
}
