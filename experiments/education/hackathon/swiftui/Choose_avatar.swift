import SwiftUI

struct Choose_avatar: View {
  var body: some View {
    ZStack {
      Text("Choose your avatar").font(.system(size: 30)).foregroundColor(Color(red: 0.9411764705882353, green: 0.5019607843137255, blue: 0.5019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(width: 298.0).frame(maxWidth: .infinity).padding(.top, 45.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Button(action: { /* TODO */ }) {
        Image("boy_transparent")
      }
      .background(Color.clear)
      .padding(.leading, 75.0)
      .padding(.top, 150.0)
      Group {
      Button(action: { /* TODO */ }) {
        Image("girl_transparent")
      }
      .background(Color.clear)
      .padding(.top, 150.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("अपने अवतार चुनें ").font(.system(size: 30)).foregroundColor(Color(red: 0.9411764705882353, green: 0.5019607843137255, blue: 0.5019607843137255, opacity: 1)).padding(.top, 75.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("Ratannरतन ").font(.system(size: 25)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 75.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Text("Latanलता").font(.system(size: 25)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottom)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Choose_avatar_Previews: PreviewProvider {
  static var previews: some View {
    Choose_avatar()
  }
}
