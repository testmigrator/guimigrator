import SwiftUI

struct Stats: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .frame(maxWidth: .infinity)
        .frame(height: 48.0)
        HStack(alignment: .center, spacing: 0) {
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
          .frame(height: 48.0)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
          .frame(height: 48.0)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Text("Since").font(.system(size: 16))
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
        .padding(.bottom, 4.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 0.0)
      .padding(.bottom, 0.0)
      VStack(alignment: .leading, spacing: 0) {
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
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Stats_Previews: PreviewProvider {
  static var previews: some View {
    Stats()
  }
}
