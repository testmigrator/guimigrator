import SwiftUI

struct Item_spinner_db_viewer: View {
  var body: some View {
    ZStack {
      Text("Displayed name").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).padding(10.0).frame(maxWidth: .infinity, alignment: .trailing)
    }
  }
}

struct Item_spinner_db_viewer_Previews: PreviewProvider {
  static var previews: some View {
    Item_spinner_db_viewer()
  }
}
