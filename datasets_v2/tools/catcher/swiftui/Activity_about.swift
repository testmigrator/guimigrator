import SwiftUI

struct Activity_about: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.6274509803921569, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.6274509803921569, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.6274509803921569, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        Text("").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 8.0).padding(.bottom, 8.0)
        Text("").font(.system(size: 14)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(height: 48.0).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(height: 48.0).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(8.0)
          HStack(alignment: .center, spacing: 0) {
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(8.0)
          HStack(alignment: .center, spacing: 0) {
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(8.0)
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("").font(.system(size: 14))
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_about_Previews: PreviewProvider {
  static var previews: some View {
    Activity_about()
  }
}
