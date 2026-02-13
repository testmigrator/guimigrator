import SwiftUI

struct Activity_feedback: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Image("ic_back").resizable().scaledToFit().frame(width: 25.0, height: 25.0).frame(maxHeight: .infinity, alignment: .center)
        Text("Feedback").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
        Text("Send").font(.system(size: 15)).multilineTextAlignment(.center)
      }
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      Rectangle().foregroundColor(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .background(Color(red: 0.8117647058823529, green: 0.8117647058823529, blue: 0.8117647058823529, opacity: 1))
      .frame(height: 1.0)
      VStack(alignment: .leading, spacing: 0) {
        TextField("Write down your suggestion", text: .constant("")).frame(maxWidth: .infinity, maxHeight: .infinity)
        TextField("", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color(red: 0.9058823529411765, green: 0.9058823529411765, blue: 0.9058823529411765, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_feedback_Previews: PreviewProvider {
  static var previews: some View {
    Activity_feedback()
  }
}
