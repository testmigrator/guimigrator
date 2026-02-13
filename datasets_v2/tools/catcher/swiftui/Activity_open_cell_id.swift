import SwiftUI

struct Activity_open_cell_id: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(8.0)
      Rectangle().foregroundColor(Color.clear)
      .background(Color.clear)
      .frame(height: 0.5)
      .padding(.top, 12.0)
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        Button(action: { }) {
          Text("")
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_open_cell_id_Previews: PreviewProvider {
  static var previews: some View {
    Activity_open_cell_id()
  }
}
