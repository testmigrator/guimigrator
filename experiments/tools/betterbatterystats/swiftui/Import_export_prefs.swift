import SwiftUI

struct Import_export_prefs: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      VStack(alignment: .center, spacing: 0) {
        Text("Import/Export Preferences from/to %s")
        Button(action: { }) {
          Text("Export")
        }
        .disabled(false)
        .padding(.top, 12.0)
        Button(action: { }) {
          Text("Import")
        }
        .disabled(false)
        .padding(.top, 12.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 4.0)
      .padding(.bottom, 4.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Import_export_prefs_Previews: PreviewProvider {
  static var previews: some View {
    Import_export_prefs()
  }
}
