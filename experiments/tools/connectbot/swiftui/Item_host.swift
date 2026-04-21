import SwiftUI

struct Item_host: View {
  var body: some View {
    ZStack {
      Image("connected").resizable().scaledToFit().frame(width: 40.0, height: 40.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
        Text("shell.example.com").padding(.top, 20.0)
        Text("2 minutes ago").padding(.bottom, 20.0)
      }
      .padding(.leading, 72.0)
      .padding(.trailing, 16.0)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Item_host_Previews: PreviewProvider {
  static var previews: some View {
    Item_host()
  }
}
