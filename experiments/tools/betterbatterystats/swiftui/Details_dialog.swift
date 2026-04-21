import SwiftUI

struct Details_dialog: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("Dialog Title").font(.system(size: 20)).foregroundColor(Color(red: 0.15294117647058825, green: 0.6823529411764706, blue: 0.3764705882352941, opacity: 1))
        Text("Title").font(.system(size: 16))
        Text("Text").font(.system(size: 13))
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 16.0)
      .padding(.bottom, 16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Details_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Details_dialog()
  }
}
