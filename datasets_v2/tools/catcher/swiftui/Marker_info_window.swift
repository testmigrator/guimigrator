import SwiftUI

struct Marker_info_window: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("").font(.system(size: 15)).foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").font(.system(size: 15)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").font(.system(size: 15)).foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("PSC:").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("RAT:").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
      HStack(alignment: .center, spacing: 0) {
        Text("Samples:").foregroundColor(Color(red: 0, green: 1, blue: 0, opacity: 1)).multilineTextAlignment(.trailing)
        Text("").foregroundColor(Color(red: 0.8666666666666667, green: 0.8666666666666667, blue: 0.8666666666666667, opacity: 1)).multilineTextAlignment(.leading)
      }
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
    .padding(12.0)
  }
}

struct Marker_info_window_Previews: PreviewProvider {
  static var previews: some View {
    Marker_info_window()
  }
}
