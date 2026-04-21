import SwiftUI

struct Search_explain: View {
  var body: some View {
    ZStack {
      Image("google_search").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity).padding(.bottom, 40.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Text("").frame(width: 50.0, height: 20.0).padding(.leading, 80.0).padding(.top, 60.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(width: 20.0, height: 20.0).padding(.leading, 120.0).padding(.top, 60.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("").frame(width: 150.0, height: 100.0).padding(.leading, 80.0).padding(.bottom, 200.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Group {
      Button(action: { }) {
        Text("Continue")
      }
      .disabled(false)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Search_explain_Previews: PreviewProvider {
  static var previews: some View {
    Search_explain()
  }
}
