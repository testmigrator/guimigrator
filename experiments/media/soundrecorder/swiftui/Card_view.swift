import SwiftUI

struct Card_view: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Group {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Image("ic_fileviewer").padding(.leading, 7.0).padding(.trailing, 7.0).frame(maxHeight: .infinity, alignment: .center)
          Group {
          VStack(alignment: .leading, spacing: 0) {
            Text("file_name").font(.system(size: 15))
            Text("00:00").font(.system(size: 12)).padding(.top, 7.0)
            Text("mmm dd yyyy - hh:mm a").font(.system(size: 12))
          }
          }
          .frame(maxHeight: .infinity, alignment: .center)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity)
      .frame(height: 75.0)
      .padding(5.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Card_view_Previews: PreviewProvider {
  static var previews: some View {
    Card_view()
  }
}
