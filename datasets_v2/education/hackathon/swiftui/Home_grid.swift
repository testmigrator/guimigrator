import SwiftUI

struct Home_grid: View {
  var body: some View {
    ZStack {
      Group {
      Button(action: { /* TODO */ }) {
        Image("world")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.leading, 52.0)
      .padding(.top, 56.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      Button(action: { /* TODO */ }) {
        Image("india")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.top, 56.0)
      .padding(.trailing, 65.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_internet")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.leading, 52.0)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_english")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.trailing, 65.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_govt")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.top, 59.0)
      .padding(.top, 100.0)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
      Group {
      Button(action: { /* TODO */ }) {
        Image("rsz_aboutus")
      }
      .background(Color.clear)
      .frame(width: 100.0, height: 100.0)
      .padding(.top, 59.0)
      .padding(.trailing, 65.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      Text("Know the world").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 52.0).padding(.top, 156.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text(" दुनिया को पता").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 12.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("Our India").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.bottom, 12.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("हमारा भारत").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("Internet").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 100.0).frame(maxWidth: .infinity, alignment: .leading)
      Text("इंटरनेट").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 12.0).frame(maxWidth: .infinity, alignment: .leading)
      Text("Learn English").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.trailing, 65.0).padding(.bottom, 12.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("अंग्रेजी सीखिये").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 12.0).frame(maxWidth: .infinity, alignment: .trailing)
      Text("About Us").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 100.0).frame(maxWidth: .infinity, alignment: .trailing)
      Text("हमारे बारे में").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 12.0).frame(maxWidth: .infinity, alignment: .trailing)
      Text("Our Government").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).padding(.top, 159.0).padding(.bottom, 12.0).frame(maxWidth: .infinity, alignment: .leading)
      Text("हमारी सरकार ").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .leading)
    }
    .background(Image("rsz_home_bg").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Home_grid_Previews: PreviewProvider {
  static var previews: some View {
    Home_grid()
  }
}
