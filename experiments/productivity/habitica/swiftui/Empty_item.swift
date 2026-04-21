import SwiftUI

struct Empty_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").padding(.bottom, 16.0)
      Text("No Items").font(.system(size: 16)).foregroundColor(Color(red: 0.40784313725490196, green: 0.3843137254901961, blue: 0.4549019607843137, opacity: 1)).multilineTextAlignment(.center).padding(.bottom, 2.0)
      Text("No Items").font(.system(size: 14)).foregroundColor(Color(red: 0.5294117647058824, green: 0.5058823529411764, blue: 0.5647058823529412, opacity: 1)).multilineTextAlignment(.center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.horizontal, 24.0)
    .padding(.top, 56.0)
  }
}

struct Empty_item_Previews: PreviewProvider {
  static var previews: some View {
    Empty_item()
  }
}
