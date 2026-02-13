import SwiftUI

struct Progress: View {
  var body: some View {
    ProgressView().frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Progress_Previews: PreviewProvider {
  static var previews: some View {
    Progress()
  }
}
