import SwiftUI

struct Silent_sms_items: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
        Text("").foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      }
      .background(Image("layer_card_background").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .padding(.top, 15.0)
      .padding(.bottom, 15.0)
      Text("").foregroundColor(Color(red: 1, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.trailing).padding(.trailing, 15.0).padding(.top, 15.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Silent_sms_items_Previews: PreviewProvider {
  static var previews: some View {
    Silent_sms_items()
  }
}
