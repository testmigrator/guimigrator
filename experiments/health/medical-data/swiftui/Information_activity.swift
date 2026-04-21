import SwiftUI

struct Information_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        VStack(alignment: .center, spacing: 0) {
          Text("Bip4cast").font(.system(size: 43)).foregroundColor(Color(red: 0.9137254901960784, green: 0.11764705882352941, blue: 0.38823529411764707, opacity: 1)).padding(.top, 45.0)
          Image("logo").resizable().scaledToFit().frame(height: 170.0).padding(.top, 30.0)
          Text("VERSION 2.1").padding(.top, 38.0)
          Text("Developed by Ana María Martínez Gómez in a project at UCM").multilineTextAlignment(.center).padding(.leading, 45.0).padding(.trailing, 45.0).padding(.top, 8.0)
          Text("See terms and conditions").foregroundColor(Color(red: 0, green: 0.6901960784313725, blue: 1, opacity: 1)).padding(.top, 32.0).padding(.bottom, 50.0)
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

struct Information_activity_Previews: PreviewProvider {
  static var previews: some View {
    Information_activity()
  }
}
