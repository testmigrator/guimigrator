import SwiftUI

struct Notification_download_progress: View {
  var body: some View {
    ZStack {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxHeight: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
        Text("").frame(maxWidth: .infinity, alignment: .leading)
        ProgressView().frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Notification_download_progress_Previews: PreviewProvider {
  static var previews: some View {
    Notification_download_progress()
  }
}
