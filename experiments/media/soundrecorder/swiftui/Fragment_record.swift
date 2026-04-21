import SwiftUI

struct Fragment_record: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(.bottom, 64.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      ProgressView().background(Image("record_progress_bar_background").resizable().scaledToFill()).frame(width: 200.0, height: 200.0).padding(.top, 27.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Group {
      Button(action: { }) {
        Text("Pause")
      }
      .disabled(false)
      .padding(.leading, 10.0)
      .padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Text("Tap the button to start recording").font(.system(size: 17)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.bottom, 60.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_record_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_record()
  }
}
