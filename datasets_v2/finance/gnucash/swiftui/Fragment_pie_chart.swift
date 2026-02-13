import SwiftUI

struct Fragment_pie_chart: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Selected chart slice").font(.system(size: 16)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(5.0)
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

struct Fragment_pie_chart_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_pie_chart()
  }
}
