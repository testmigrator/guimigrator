import SwiftUI

struct Activity_main: View {
  var body: some View {
    ZStack {
      Group {
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      ZStack {
        Button(action: { }) {
          Text("Show Column Types").frame(maxWidth: .infinity, alignment: .leading)
        }
        .disabled(false)
        Group {
        Button(action: { }) {
          Text("Uncheck All").frame(maxWidth: .infinity, alignment: .leading)
        }
        .disabled(false)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        Button(action: { }) {
          Text("Check All").frame(maxWidth: .infinity, alignment: .leading)
        }
        .disabled(false)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("Columns:").padding(.trailing, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Text("-").padding(.bottom, 5.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Group {
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      VStack(alignment: .center, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Query").frame(maxWidth: .infinity, alignment: .leading)
          }
          .disabled(false)
          Button(action: { }) {
            Text("Query With Filter").frame(maxWidth: .infinity, alignment: .leading)
          }
          .disabled(false)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("Rows:").padding(.trailing, 4.0)
          Text("-")
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 5.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.bottom, 5.0)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
