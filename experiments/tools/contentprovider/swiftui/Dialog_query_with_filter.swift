import SwiftUI

struct Dialog_query_with_filter: View {
  var body: some View {
    ZStack {
      Text("Where:").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
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
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
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
      TextField("", text: .constant("")).frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("Note: Enclose Strings in single quotes!").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("Sort by:").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
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
      Group {
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Text("Limit:").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      TextField("", text: .constant("")).frame(maxWidth: .infinity).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(5.0)
  }
}

struct Dialog_query_with_filter_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_query_with_filter()
  }
}
