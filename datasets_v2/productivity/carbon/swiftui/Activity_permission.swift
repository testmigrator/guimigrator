import SwiftUI

struct Activity_permission: View {
  var body: some View {
    ZStack {
      Group {
      Button(action: { }) {
        Text("Proceed")
      }
      .disabled(false)
      .background(Image("elesimulation").resizable().scaledToFill())
      .padding(.top, 46.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .background(Image("perm").resizable().scaledToFill())
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_permission_Previews: PreviewProvider {
  static var previews: some View {
    Activity_permission()
  }
}
