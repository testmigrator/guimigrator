import SwiftUI

struct Memo_add: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .frame(height: 150.0)
        .padding(20.0)
        }
        .frame(maxWidth: .infinity, alignment: .center)
      }
      .background(Image("hover_border_normal").resizable().scaledToFill())
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(3.0)
  }
}

struct Memo_add_Previews: PreviewProvider {
  static var previews: some View {
    Memo_add()
  }
}
