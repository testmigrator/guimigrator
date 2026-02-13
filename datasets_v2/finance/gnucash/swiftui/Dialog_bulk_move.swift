import SwiftUI

struct Dialog_bulk_move: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Destination Account").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).padding(.leading, 10.0).padding(.trailing, 16.0).padding(.top, 5.0).padding(.bottom, -8.0)
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      .padding(.leading, 10.0)
      .padding(.trailing, 10.0)
      .padding(.bottom, 10.0)
      VStack(alignment: .leading, spacing: 0) {
        Spacer()
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Cancel").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Save").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.top, 5.0)
    }
    .frame(maxWidth: .infinity)
    .padding(10.0)
  }
}

struct Dialog_bulk_move_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_bulk_move()
  }
}
