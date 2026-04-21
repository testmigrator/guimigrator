import SwiftUI

struct Fragment_topic_detail: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 50.0)
      Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1)).frame(height: 50.0).padding(.trailing, 15.0).padding(.bottom, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_topic_detail_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_topic_detail()
  }
}
