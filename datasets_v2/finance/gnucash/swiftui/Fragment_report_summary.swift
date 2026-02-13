import SwiftUI

struct Fragment_report_summary: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Pie Chart")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Bar Chart")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Line Chart")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Sheet")
          }
          .disabled(false)
          .frame(maxWidth: .infinity)
        }
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 12.0)
      Text("Expenses for last 3 months").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .frame(height: 250.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 12.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("Total Assets").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("$ 2,500").font(.system(size: 18)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
          }
          HStack(alignment: .center, spacing: 0) {
            Text("Total Liabilities").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("$ 2,700").font(.system(size: 18)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
          }
          HStack(alignment: .center, spacing: 0) {
            Text("Net Worth").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("$ -200").font(.system(size: 18)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
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

struct Fragment_report_summary_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_report_summary()
  }
}
