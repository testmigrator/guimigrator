import SwiftUI

struct Fragment_content: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
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
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      ZStack {
        Group {
        VStack(alignment: .center, spacing: 0) {
        }
        }
        .frame(maxWidth: .infinity, alignment: .center)
        ProgressView().frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.bottom, 100.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_content_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_content()
  }
}
