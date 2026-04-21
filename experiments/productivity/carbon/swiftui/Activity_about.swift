import SwiftUI

struct Activity_about: View {
  var body: some View {
    ZStack {
      Text("1.5").font(.system(size: 18)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
      Text("Version").font(.system(size: 20)).padding(.bottom, 18.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_about_Previews: PreviewProvider {
  static var previews: some View {
    Activity_about()
  }
}
