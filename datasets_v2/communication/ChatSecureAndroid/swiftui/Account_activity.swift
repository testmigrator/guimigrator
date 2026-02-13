import SwiftUI

struct Account_activity: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        TextField("user@domain", text: .constant("")).frame(maxWidth: .infinity)
        TextField("password", text: .constant("")).frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("Sign in").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Image("btn_green_pressed").resizable().scaledToFill())
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 3.0)
        .padding(.bottom, 3.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 3.0)
        .padding(.bottom, 3.0)
        Button(action: { }) {
          Text("Advanced Account Settings")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Account_activity_Previews: PreviewProvider {
  static var previews: some View {
    Account_activity()
  }
}
