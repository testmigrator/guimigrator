import SwiftUI

struct Profile_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        VStack(alignment: .leading, spacing: 0) {
          Text("NAME").padding(.top, 20.0)
          TextField("", text: .constant(""))
          Text("EMAIL").padding(.top, 30.0)
          TextField("", text: .constant(""))
          Text("BIRTH DATE").padding(.top, 30.0)
          VStack(alignment: .leading, spacing: 0) {
          }
          Text("GENDER").padding(.top, 30.0)
          HStack(alignment: .leading, spacing: 8) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("MALE", isOn: .constant(false))
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("FEMALE", isOn: .constant(false)).padding(.leading, 50.0)
          }
          .padding(.top, 12.0)
          Text("INTRODUCE YOUR PIN").padding(.top, 23.0)
          TextField("", text: .constant(""))
          Button(action: { }) {
            Text("SAVE CHANGES")
          }
          .disabled(false)
          .padding(.top, 40.0)
          .padding(.bottom, 60.0)
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

struct Profile_activity_Previews: PreviewProvider {
  static var previews: some View {
    Profile_activity()
  }
}
