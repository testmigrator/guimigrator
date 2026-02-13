import SwiftUI

struct Dialog_transfer_funds: View {
  var body: some View {
    ZStack {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("Amount").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("$ 2000.00").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .padding(10.0)
          HStack(alignment: .center, spacing: 0) {
            Text("From:").font(.system(size: 16)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("USD").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("To:").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("EUR").font(.system(size: 18)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .padding(10.0)
          Text("Provide either the converted amount or exchange rate in order to transfer funds").frame(maxWidth: .infinity, alignment: .leading).padding(10.0)
          HStack(alignment: .center, spacing: 0) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("Option", isOn: .constant(false)).frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Exchange rate", text: .constant("")).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
          }
          .padding(.top, 10.0)
          Text("1 USD = 1.34 EUR").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.bottom, 10.0)
          HStack(alignment: .center, spacing: 0) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("Option", isOn: .constant(false)).frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Converted Amount", text: .constant("")).frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            Text("EUR").font(.system(size: 16)).multilineTextAlignment(.center).frame(maxWidth: .infinity)
          }
          .padding(10.0)
          VStack(alignment: .leading, spacing: 0) {
            Spacer()
            HStack(alignment: .center, spacing: 0) {
              Button(action: { }) {
                Text("Cancel").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
              }
              .disabled(false)
              .buttonStyle(.plain)
              .frame(maxWidth: .infinity)
              Button(action: { }) {
                Text("Save").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
              }
              .disabled(false)
              .buttonStyle(.plain)
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          .padding(.top, 5.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_transfer_funds_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_transfer_funds()
  }
}
