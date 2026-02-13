import SwiftUI

struct Email_explain: View {
  var body: some View {
    ZStack {
      Image("email_struct").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(width: 5.0, height: 10.0).padding(.leading, 70.0).padding(.top, 180.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(width: 70.0, height: 20.0).padding(.leading, 70.0).padding(.top, 20.0).padding(.top, 190.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("").frame(maxWidth: .infinity, alignment: .leading).frame(height: 100.0).padding(.leading, 30.0).padding(.trailing, 180.0).padding(.top, 90.0).padding(.top, 40.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Group {
      Button(action: { }) {
        Text("Continue")
      }
      .disabled(false)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Email_explain_Previews: PreviewProvider {
  static var previews: some View {
    Email_explain()
  }
}
