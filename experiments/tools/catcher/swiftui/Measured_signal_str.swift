import SwiftUI

struct Measured_signal_str: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .background(Image("layer_card_background").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .padding(.top, 12.0)
      .padding(.bottom, 12.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Measured_signal_str_Previews: PreviewProvider {
  static var previews: some View {
    Measured_signal_str()
  }
}
