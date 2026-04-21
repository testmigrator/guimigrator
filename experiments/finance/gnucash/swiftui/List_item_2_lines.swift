import SwiftUI

struct List_item_2_lines: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
      Text("Secondary text")
    }
    .frame(maxWidth: .infinity)
  }
}

struct List_item_2_lines_Previews: PreviewProvider {
  static var previews: some View {
    List_item_2_lines()
  }
}
