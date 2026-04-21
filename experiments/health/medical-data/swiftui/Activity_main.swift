import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("INSERT THE PIN").foregroundColor(Color(red: 0.3333333333333333, green: 0.3333333333333333, blue: 0.3333333333333333, opacity: 1)).padding(.top, 40.0)
      TextField("", text: .constant("")).padding(.top, 30.0)
      Button(action: { }) {
        Text("START")
      }
      .disabled(false)
      .padding(.top, 65.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
