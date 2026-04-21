import SwiftUI

struct Fragment_text_report: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Assets").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 12.0)
      Text("Liabilities").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 12.0)
      Text("Equity").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 12.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("Net Worth").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("$ 2,500").font(.system(size: 18)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
          }
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(10.0)
  }
}

struct Fragment_text_report_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_text_report()
  }
}
