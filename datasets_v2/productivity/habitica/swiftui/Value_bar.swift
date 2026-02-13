import SwiftUI

struct Value_bar: View {
  var body: some View {
    ZStack {
      ProgressView().frame(maxWidth: .infinity).frame(height: 8.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      Group {
      HStack(alignment: .center, spacing: 0) {
        Text("50/50").font(.system(size: 14)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
        Text("Health").font(.system(size: 14)).multilineTextAlignment(.center)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 2.0)
      .padding(.top, 8.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Value_bar_Previews: PreviewProvider {
  static var previews: some View {
    Value_bar()
  }
}
