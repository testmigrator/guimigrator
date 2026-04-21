import SwiftUI

struct Comments_activity: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
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
        .background(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1))
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Comments_activity_Previews: PreviewProvider {
  static var previews: some View {
    Comments_activity()
  }
}
