import SwiftUI

struct Dialog_rename_file: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      Text(".mp4")
    }
    .frame(maxWidth: .infinity)
    .padding(20.0)
  }
}

struct Dialog_rename_file_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_rename_file()
  }
}
