import SwiftUI

struct Dbe_import_items: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("MCC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("LAC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("MNC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("CID:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 0.9176470588235294, blue: 0.34901960784313724, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("RAT:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("Lat:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("PSC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("Lon:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("Samples:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("isExact:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("AvgSignal: ").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("tFirst:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("AvgRange: ").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("tLast:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("Source:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("rej_cause: ").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 0.9176470588235294, blue: 0.34901960784313724, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
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

struct Dbe_import_items_Previews: PreviewProvider {
  static var previews: some View {
    Dbe_import_items()
  }
}
