import SwiftUI

struct Activity_main_first_time: View {
  var body: some View {
    ScrollView {
      ZStack {
        VStack(alignment: .center, spacing: 0) {
          Text("EMAIL").padding(.top, 40.0)
          TextField("", text: .constant(""))
          Text("PIN (6 digits)").padding(.top, 30.0)
          TextField("", text: .constant(""))
          Button(action: { }) {
            Text("SIGN IN")
          }
          .disabled(false)
          .padding(.top, 65.0)
          .padding(.bottom, 30.0)
          Text("Sign up").foregroundColor(Color(red: 0.9137254901960784, green: 0.11764705882352941, blue: 0.38823529411764707, opacity: 1))
        }
        .frame(maxWidth: .infinity)
        .padding(.leading, 16.0)
        .padding(.trailing, 16.0)
        .padding(.top, 16.0)
        .padding(.bottom, 16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_first_time_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main_first_time()
  }
}
