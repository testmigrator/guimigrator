import SwiftUI

struct Stat_row: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 48.0, height: 48.0).padding(.top, 0.0).padding(.bottom, 0.0).frame(maxHeight: .infinity, alignment: .center)
      VStack(alignment: .leading, spacing: 0) {
        Text("Name").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
        HStack(alignment: .center, spacing: 0) {
          Text("NameGoesHere").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("DataGoesHere").font(.system(size: 13)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color(red: 0.8, green: 0.8, blue: 0.8, opacity: 0.3137254901960784))
        .frame(width: 48.0, height: 48.0)
        .padding(4.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 2.0)
    .padding(.bottom, 2.0)
  }
}

struct Stat_row_Previews: PreviewProvider {
  static var previews: some View {
    Stat_row()
  }
}
