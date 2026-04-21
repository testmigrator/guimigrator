import SwiftUI

struct Dialog_add_content_provider: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Insert content provider manually:")
      TextField("", text: .constant("")).frame(maxWidth: .infinity)
      Text("Or search for available content providers:").padding(.top, 4.0)
      Button(action: { }) {
        Text("Search").frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Dialog_add_content_provider_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_add_content_provider()
  }
}
