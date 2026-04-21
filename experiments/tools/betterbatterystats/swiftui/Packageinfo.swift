import SwiftUI

struct Packageinfo: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image(systemName: "photo").resizable().scaledToFit().frame(width: 48.0, height: 48.0).padding(16.0)
        Text("Package Name").font(.system(size: 16)).frame(maxHeight: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      ZStack {
        Group {
        Button(action: { }) {
          Text("Application Settings").frame(maxWidth: .infinity, alignment: .leading)
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 16.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      Group {
      ZStack {
        Group {
        Button(action: { }) {
          Text("App Ops").frame(maxWidth: .infinity, alignment: .leading)
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 16.0)
      .padding(.trailing, 16.0)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Packageinfo_Previews: PreviewProvider {
  static var previews: some View {
    Packageinfo()
  }
}
