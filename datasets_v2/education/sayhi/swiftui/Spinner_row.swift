import SwiftUI

struct Spinner_row: View {
  var body: some View {
    Text("").font(.system(size: 20)).foregroundColor(Color.clear).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(5.0)
  }
}

struct Spinner_row_Previews: PreviewProvider {
  static var previews: some View {
    Spinner_row()
  }
}
