import SwiftUI

struct Item_terminal: View {
  var body: some View {
    ZStack {
      Text("").background(Color(red: 0, green: 0, blue: 0, opacity: 0.6666666666666666)).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Item_terminal_Previews: PreviewProvider {
  static var previews: some View {
    Item_terminal()
  }
}
