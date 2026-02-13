import SwiftUI

struct Activity_story: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .center, spacing: 0) {
        Image("cloud_off").resizable().scaledToFit().frame(width: 80.0, height: 80.0).padding(.top, -60.0).padding(.bottom, 15.0)
        Text("Unable to load content").font(.system(size: 20)).multilineTextAlignment(.center).padding(.bottom, 20.0)
        Button(action: { }) {
          Text("Try Again")
        }
        .disabled(false)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_story_Previews: PreviewProvider {
  static var previews: some View {
    Activity_story()
  }
}
