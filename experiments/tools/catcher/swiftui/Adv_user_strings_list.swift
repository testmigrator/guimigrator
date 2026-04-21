import SwiftUI

struct Adv_user_strings_list: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("String:").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).frame(height: 35.0).frame(maxWidth: .infinity)
        Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1))
      }
      .frame(maxWidth: .infinity)
      Text(" Type: ").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).frame(height: 35.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Adv_user_strings_list_Previews: PreviewProvider {
  static var previews: some View {
    Adv_user_strings_list()
  }
}
