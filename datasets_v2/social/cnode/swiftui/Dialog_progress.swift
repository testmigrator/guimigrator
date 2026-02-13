import SwiftUI

struct Dialog_progress: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Color.clear
      .frame(width: 30.0, height: 30.0)
      Text("").font(.system(size: 16)).foregroundColor(Color.clear).padding(.leading, 3.0)
    }
    .background(Image("dialog_loading_bg").resizable().scaledToFill())
    .padding(15.0)
  }
}

struct Dialog_progress_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_progress()
  }
}
