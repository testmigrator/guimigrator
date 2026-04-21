import SwiftUI

struct Dialog_owncloud_account: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      TextField("https://", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 16.0).padding(.bottom, 4.0)
      Text("").foregroundColor(Color(red: 0.7568627450980392, green: 0.10588235294117647, blue: 0.09019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity, alignment: .center)
      TextField("User Name", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 16.0).padding(.bottom, 4.0)
      Text("").foregroundColor(Color(red: 0.7568627450980392, green: 0.10588235294117647, blue: 0.09019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity, alignment: .center)
      TextField("Password", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 4.0).padding(.bottom, 16.0)
      TextField("", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 16.0).padding(.bottom, 4.0)
      Text("").foregroundColor(Color(red: 0.7568627450980392, green: 0.10588235294117647, blue: 0.09019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
        Spacer()
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Cancel").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Save").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 5.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_owncloud_account_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_owncloud_account()
  }
}
