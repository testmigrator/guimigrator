import SwiftUI

struct Activity_advanced_user: View {
  var body: some View {
    ZStack {
      Text("").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Group {
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      TextField("", text: .constant("")).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Group {
      Button(action: { }) {
        Text("INSERT")
      }
      .disabled(false)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      Text("CAUTION!!!").foregroundColor(Color(red: 1, green: 0, blue: 0, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
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
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Activity_advanced_user_Previews: PreviewProvider {
  static var previews: some View {
    Activity_advanced_user()
  }
}
