import SwiftUI

struct Smp_question_dialog: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          ScrollView {
            VStack(alignment: .leading, spacing: 0) {
              HStack(alignment: .center, spacing: 0) {
                Text("Enter a question to send to your contact, and the answer you expect them to give, in order to verify they are who they claim to be.")
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity)
              .padding(6.0)
              HStack(alignment: .center, spacing: 0) {
                TextField("the question to ask", text: .constant("")).frame(maxWidth: .infinity)
              }
              .padding(6.0)
              HStack(alignment: .center, spacing: 0) {
                TextField("the expected answer", text: .constant("")).frame(maxWidth: .infinity)
              }
              .padding(6.0)
            }
            .frame(maxHeight: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Smp_question_dialog_Previews: PreviewProvider {
  static var previews: some View {
    Smp_question_dialog()
  }
}
