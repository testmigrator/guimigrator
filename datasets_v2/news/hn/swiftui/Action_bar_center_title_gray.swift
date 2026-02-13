import SwiftUI

struct Action_bar_center_title_gray: View {
  var body: some View {
    ZStack {
      Text("HN").font(.system(size: 24)).foregroundColor(Color(red: 0.4745098039215686, green: 0.4745098039215686, blue: 0.4745098039215686, opacity: 1)).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxHeight: .infinity)
  }
}

struct Action_bar_center_title_gray_Previews: PreviewProvider {
  static var previews: some View {
    Action_bar_center_title_gray()
  }
}
