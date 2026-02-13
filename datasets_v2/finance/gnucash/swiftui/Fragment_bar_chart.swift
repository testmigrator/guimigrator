import SwiftUI

struct Fragment_bar_chart: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Nothing selected").font(.system(size: 16)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(5.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(10.0)
      .padding(.bottom, 12.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(10.0)
  }
}

struct Fragment_bar_chart_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_bar_chart()
  }
}
