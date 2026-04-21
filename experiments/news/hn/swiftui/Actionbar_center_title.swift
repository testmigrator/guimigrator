import SwiftUI

struct Actionbar_center_title: View {
  var body: some View {
    ZStack {
      Text("HN").font(.system(size: 24)).foregroundColor(Color.white).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxHeight: .infinity)
  }
}

struct Actionbar_center_title_Previews: PreviewProvider {
  static var previews: some View {
    Actionbar_center_title()
  }
}
