import SwiftUI

struct Graph_row: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Title").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
      .frame(height: 48.0)
      .padding(0.0)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 2.0)
    .padding(.bottom, 2.0)
  }
}

struct Graph_row_Previews: PreviewProvider {
  static var previews: some View {
    Graph_row()
  }
}
