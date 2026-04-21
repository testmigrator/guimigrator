import SwiftUI

struct Activity_main: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .center, spacing: 0) {
        Text("$0.00").font(.system(size: 50)).foregroundColor(Color.white)
        Text("0 BTC").font(.system(size: 20)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 0.5019607843137255)).padding(.top, 10.0)
      }
      }
      .frame(maxWidth: .infinity, alignment: .center)
      Text("Never updated").foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 0.2823529411764706)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
    }
    .background(Image("gradient").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
