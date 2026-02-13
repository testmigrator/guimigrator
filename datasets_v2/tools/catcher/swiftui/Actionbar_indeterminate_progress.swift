import SwiftUI

struct Actionbar_indeterminate_progress: View {
  var body: some View {
    ZStack {
      ProgressView().frame(width: 32.0, height: 32.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(width: 56.0)
  }
}

struct Actionbar_indeterminate_progress_Previews: PreviewProvider {
  static var previews: some View {
    Actionbar_indeterminate_progress()
  }
}
