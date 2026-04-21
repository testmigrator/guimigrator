import SwiftUI

struct Default_buttons: View {
  var body: some View {
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
}

struct Default_buttons_Previews: PreviewProvider {
  static var previews: some View {
    Default_buttons()
  }
}
