import SwiftUI

struct Dia_resize: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      TextField("", text: .constant(""))
      Text("×")
      TextField("", text: .constant(""))
    }
  }
}

struct Dia_resize_Previews: PreviewProvider {
  static var previews: some View {
    Dia_resize()
  }
}
