import SwiftUI

struct Activity_memo: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .frame(height: 1.0)
      VStack(alignment: .leading, spacing: 0) {
        ScrollView {
          TextField("", text: .constant("")).background(Color(red: 0, green: 0, blue: 0, opacity: 0)).frame(maxWidth: .infinity).padding(.top, 12.0).padding(.bottom, 5.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_memo_Previews: PreviewProvider {
  static var previews: some View {
    Activity_memo()
  }
}
