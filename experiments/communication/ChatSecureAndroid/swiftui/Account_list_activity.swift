import SwiftUI

struct Account_list_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Text("< swipe left and right for more options >").foregroundColor(Color(red: 0.8, green: 0.8, blue: 0.8, opacity: 1)).multilineTextAlignment(.center).background(Color(red: 0.2, green: 0.2, blue: 0.2, opacity: 0.8666666666666667)).frame(maxWidth: .infinity, alignment: .center).padding(8.0).padding(.top, 0.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color(red: 0.2, green: 0.2, blue: 0.2, opacity: 0.8666666666666667))
      .frame(maxWidth: .infinity)
      .frame(height: 40.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Account_list_activity_Previews: PreviewProvider {
  static var previews: some View {
    Account_list_activity()
  }
}
