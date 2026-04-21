import SwiftUI

struct Adv_user_sms_listview: View {
  var body: some View {
    ZStack {
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("TS:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("TYPE:").font(.system(size: 12)).foregroundColor(Color(red: 1, green: 0, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("NUM:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("MSG:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("LAC:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("CID:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("RAT:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("ROAM:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("LAT:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("LON:").font(.system(size: 12)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1))
            Text("").font(.system(size: 12)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 77.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 5.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Adv_user_sms_listview_Previews: PreviewProvider {
  static var previews: some View {
    Adv_user_sms_listview()
  }
}
