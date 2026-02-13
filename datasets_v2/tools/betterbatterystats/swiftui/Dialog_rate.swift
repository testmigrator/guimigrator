import SwiftUI

struct Dialog_rate: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Dialog Title").font(.system(size: 20)).foregroundColor(Color(red: 0.15294117647058825, green: 0.6823529411764706, blue: 0.3764705882352941, opacity: 1))
      Button(action: { }) {
        Text("Rate").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Remind me later").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("No, thanks").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Dialog_rate_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_rate()
  }
}
