import SwiftUI

struct Internet_introduction_layout: View {
  var body: some View {
    ZStack {
      Group {
      Text("
        nImagnine you want to play with your friend but he/she lives far off from your house.
        nNow imagine there is a tunnel below your house and theirs connecting them.
        nThese tunnels are magical so that you are transported to their place as soon as you step in the tunnel, you can share your toys and talk through this tunnel as well.
        nNow imagine all your friends and the entire world even has this tunnel below their houses.").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 0.8941176470588236, blue: 0.8823529411764706, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.leading, 40.0).padding(.trailing, 40.0).padding(.top, 65.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("Internet is that tunnel!").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.8941176470588236, blue: 0.8823529411764706, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 16.0).padding(.top, 82.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Internet_introduction_layout_Previews: PreviewProvider {
  static var previews: some View {
    Internet_introduction_layout()
  }
}
