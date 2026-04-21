import SwiftUI

struct Help_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        ZStack {
          Text("help").padding(.leading, 16.0).padding(.trailing, 16.0).padding(.top, 25.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("help description").padding(.trailing, 16.0).padding(.top, 5.0).padding(.bottom, 30.0).padding(.leading, 16.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .background(Image("border").resizable().scaledToFill())
        .frame(maxWidth: .infinity)
        .padding(.leading, 16.0)
        .padding(.trailing, 16.0)
        .padding(.top, 25.0)
        .padding(.bottom, 35.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Help_activity_Previews: PreviewProvider {
  static var previews: some View {
    Help_activity()
  }
}
