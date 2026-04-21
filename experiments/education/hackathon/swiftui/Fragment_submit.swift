import SwiftUI

struct Fragment_submit: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Submit").font(.system(size: 20)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
      ScrollView {
        VStack(alignment: .center, spacing: 0) {
          TextField("Name", text: .constant("")).frame(maxWidth: .infinity)
          TextField("Location", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 8.0)
          TextField("Title", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 8.0)
          TextField("Story", text: .constant("")).frame(maxWidth: .infinity).padding(.top, 8.0)
          Picker("", selection: .constant(0)) {
            Text("Category").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
          .padding(.top, 8.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 8.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(24.0)
  }
}

struct Fragment_submit_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_submit()
  }
}
