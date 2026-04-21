import SwiftUI

struct Configuration_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        ZStack {
          Text("CONFIGURATION").foregroundColor(Color(red: 0.0196078431372549, green: 0.0196078431372549, blue: 0.0196078431372549, opacity: 1)).padding(.leading, 5.0).padding(.top, 17.0).padding(.bottom, 5.0)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("Allow to use mobile data to send information.").padding(.top, 35.0).padding(.leading, 5.0).padding(.top, 2.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 35.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("Allow to collect information about location.").padding(.top, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        }
        .frame(maxWidth: .infinity)
        .padding(.leading, 16.0)
        .padding(.trailing, 16.0)
        .padding(.top, 16.0)
        .padding(.bottom, 16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Configuration_activity_Previews: PreviewProvider {
  static var previews: some View {
    Configuration_activity()
  }
}
