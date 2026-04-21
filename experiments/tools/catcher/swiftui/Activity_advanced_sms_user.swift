import SwiftUI

struct Activity_advanced_sms_user: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("")
      Text("CAUTION!!!").foregroundColor(Color(red: 1, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center)
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_advanced_sms_user_Previews: PreviewProvider {
  static var previews: some View {
    Activity_advanced_sms_user()
  }
}
