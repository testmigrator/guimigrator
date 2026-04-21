import SwiftUI

struct Splash_screen: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image("rsz_ow").resizable().scaledToFit().background(Color.clear).frame(width: 200.0, height: 200.0).padding(.top, 70.0).frame(maxWidth: .infinity, alignment: .center)
      Image("sah").resizable().scaledToFit().background(Color.clear).frame(width: 400.0, height: 100.0).padding(.top, 4.0)
      Text("सीखो  सिखाअो,  पढ़ो  पढ़ाअो,  ").font(.system(size: 26)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
      Text("ङिजिटल  इिॱङिया  बनाअो  !").font(.system(size: 26)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
      Text("Towards a Stronger Digital India").font(.system(size: 20)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 12.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Splash_screen_Previews: PreviewProvider {
  static var previews: some View {
    Splash_screen()
  }
}
