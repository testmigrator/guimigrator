import SwiftUI

struct About_us: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("About Us").font(.system(size: 50)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
      Image("rsz_ow").resizable().scaledToFit().background(Color.clear).frame(width: 200.0, height: 200.0).padding(.top, 4.0).frame(maxWidth: .infinity, alignment: .center)
      Image("sah").resizable().scaledToFit().background(Color.clear).frame(width: 400.0, height: 100.0).padding(.top, 4.0)
      Text("v 0.0.1").foregroundColor(Color(red: 0.9411764705882353, green: 0.5019607843137255, blue: 0.5019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(width: 372.0).frame(maxWidth: .infinity, alignment: .trailing)
      Text("Made with ♥ for India, in India. ").font(.system(size: 20)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).padding(.top, 20.0).frame(maxWidth: .infinity, alignment: .center)
      Text("http://neophytes.github.io/microsoft-pragyan-hackathon/").padding(.top, 32.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct About_us_Previews: PreviewProvider {
  static var previews: some View {
    About_us()
  }
}
