import SwiftUI

struct Failed_item: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Image("failed_loading")
      Text("Failed to load").foregroundColor(Color(red: 0.3058823529411765, green: 0.2901960784313726, blue: 0.3411764705882353, opacity: 1))
      Button(action: { }) {
        Text("Retry")
      }
      .disabled(false)
      .padding(.top, 16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Failed_item_Previews: PreviewProvider {
  static var previews: some View {
    Failed_item()
  }
}
