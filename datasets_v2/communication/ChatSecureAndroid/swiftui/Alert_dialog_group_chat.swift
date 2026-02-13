import SwiftUI

struct Alert_dialog_group_chat: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Picker("", selection: .constant(0)) {
        Text("Account to add to:").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      TextField("nickname to use in room", text: .constant("")).frame(maxWidth: .infinity)
      TextField("name of room to create or join\"", text: .constant("")).frame(maxWidth: .infinity)
      TextField("groupchat server (conference.foo.com)", text: .constant("")).frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Alert_dialog_group_chat_Previews: PreviewProvider {
  static var previews: some View {
    Alert_dialog_group_chat()
  }
}
