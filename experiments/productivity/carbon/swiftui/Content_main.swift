import SwiftUI

struct Content_main: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(.top, 5.0)
        .padding(.trailing, 16.0)
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
        .background(Image("elesimulation").resizable().scaledToFill())
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        .padding(.top, 7.0)
        .padding(.bottom, 47.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Content_main_Previews: PreviewProvider {
  static var previews: some View {
    Content_main()
  }
}
