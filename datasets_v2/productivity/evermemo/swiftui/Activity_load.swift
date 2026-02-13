import SwiftUI

struct Activity_load: View {
  var body: some View {
    ZStack {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image("splash_icon").resizable().scaledToFit().frame(width: 192.5, height: 55.0).padding(.bottom, 30.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.bottom, 80.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Group {
      VStack(alignment: .center, spacing: 0) {
        Image("splash_wandoujia").resizable().scaledToFit().frame(width: 137.4, height: 30.0).padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity)
      .frame(height: 80.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_load_Previews: PreviewProvider {
  static var previews: some View {
    Activity_load()
  }
}
