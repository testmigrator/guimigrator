import SwiftUI

struct Unique_bts_data: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("CID:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("PSC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("LAC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("T3212:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("MCC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("eLat:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("MNC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("eLon:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("A5x:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("FirstSeen:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("ST_id:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("LastSeen:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.2, green: 0.7098039215686275, blue: 0.8980392156862745, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .background(Image("layer_card_background").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Unique_bts_data_Previews: PreviewProvider {
  static var previews: some View {
    Unique_bts_data()
  }
}
