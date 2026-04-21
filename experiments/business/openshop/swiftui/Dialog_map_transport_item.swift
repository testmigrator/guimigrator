import SwiftUI

struct Dialog_map_transport_item: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image("ic_notification_big").padding(.trailing, 5.0)
      Text("Shop is 4000 km from nearest train station. \\nTake a taxi to get there.").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(.bottom, 4.0)
  }
}

struct Dialog_map_transport_item_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_map_transport_item()
  }
}
