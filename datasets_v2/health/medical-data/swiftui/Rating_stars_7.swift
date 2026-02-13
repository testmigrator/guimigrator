import SwiftUI

struct Rating_stars_7: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Text("-3").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill())
      Text("-2").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
      Text("-1").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
      Text("0").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
      Text("1").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
      Text("2").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
      Text("3").font(.system(size: 18)).multilineTextAlignment(.center).background(Image("star").resizable().scaledToFill()).padding(.leading, 7.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Rating_stars_7_Previews: PreviewProvider {
  static var previews: some View {
    Rating_stars_7()
  }
}
