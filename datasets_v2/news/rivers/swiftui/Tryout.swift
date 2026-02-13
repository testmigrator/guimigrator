import SwiftUI

struct Tryout: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Button(action: { }) {
        Text("Craigslist Cities")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Show Dialog 4")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Post RSS")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Ping RSS Cloud")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Get Airport Codes")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Insert Podcast entry")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Start podcast manager")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Bookmark Collection")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Download Atom")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Download Rss")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Download File")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Button(action: { }) {
        Text("Download GIF Image")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Group {
      Button(action: { }) {
        Text("Download JPG Image")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Button(action: { }) {
        Text("Download PNG Image")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      Group {
      Button(action: { }) {
        Text("Show Notification")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Setup Bookmark Table")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Insert Data to Bookmark")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Download recursive OPML")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Show an outline")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("Download RiverJs with Opml Source")
      }
      .disabled(false)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Tryout_Previews: PreviewProvider {
  static var previews: some View {
    Tryout()
  }
}
