import SwiftUI

struct Graphs: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Text("Battery").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .frame(height: 100.0)
        .padding(0.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 0.0)
      .padding(.bottom, 0.0)
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Graphs_Previews: PreviewProvider {
  static var previews: some View {
    Graphs()
  }
}
