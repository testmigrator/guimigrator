import SwiftUI

struct Dialog_restart_app: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Restart").font(.system(size: 20)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
      Text("To change the shop an app restart is needed.").font(.system(size: 16)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).padding(.top, 8.0)
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("Cancel").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
        .frame(maxWidth: .infinity)
        .padding(.top, 8.0)
        .padding(.bottom, 8.0)
        Button(action: { }) {
          Text("OK").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
        .padding(.top, 8.0)
        .padding(.bottom, 8.0)
        .padding(.leading, 15.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 15.0)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
  }
}

struct Dialog_restart_app_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_restart_app()
  }
}
