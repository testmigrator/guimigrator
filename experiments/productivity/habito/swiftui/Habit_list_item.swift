import SwiftUI

struct Habit_list_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Group {
      VStack(alignment: .center, spacing: 0) {
        Text("Read 10 minutes").font(.system(size: 14)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center)
        Text("today").font(.system(size: 10)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center)
        Text("00").font(.system(size: 36)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Habit_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Habit_list_item()
  }
}
