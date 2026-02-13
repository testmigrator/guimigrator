import SwiftUI

struct Fragment_split_editor: View {
  var body: some View {
    ZStack {
      Group {
      HStack(alignment: .center, spacing: 0) {
        Text("Imbalance:").multilineTextAlignment(.center)
        Text("$200").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Rectangle().foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1))
      .background(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1))
      .frame(height: 1.0)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
      Group {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_split_editor_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_split_editor()
  }
}
