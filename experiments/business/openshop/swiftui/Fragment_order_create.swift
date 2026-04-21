import SwiftUI

struct Fragment_order_create: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
            Text("Summary").font(.system(size: 14)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
            VStack(alignment: .leading, spacing: 0) {
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 8.0)
            Text("15212 USD").font(.system(size: 16)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).padding(.top, 4.0)
          }
          .frame(maxWidth: .infinity)
          Color.clear
          .background(Color(red: 0.9490196078431372, green: 0.9490196078431372, blue: 0.9490196078431372, opacity: 1))
          .frame(height: 16.0)
          .padding(.top, 16.0)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
            VStack(alignment: .leading, spacing: 0) {
              Text("Shipping method").font(.system(size: 14)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
              HStack(alignment: .center, spacing: 0) {
                Text("Choose shipping method").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
                Text("free").font(.system(size: 13)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
              }
              .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
              .frame(maxWidth: .infinity)
            }
            .background(Color.clear)
            .frame(maxWidth: .infinity)
            ProgressView()
            VStack(alignment: .leading, spacing: 0) {
              Text("Payment").font(.system(size: 15)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 16.0)
              HStack(alignment: .center, spacing: 0) {
                Text("Choose payment method").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
                Text("free").font(.system(size: 13)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
              }
              .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
              .frame(maxWidth: .infinity)
            }
            .background(Color.clear)
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          Color.clear
          .background(Color(red: 0.9490196078431372, green: 0.9490196078431372, blue: 0.9490196078431372, opacity: 1))
          .frame(height: 16.0)
          .padding(.top, 16.0)
          .padding(.bottom, 16.0)
          VStack(alignment: .leading, spacing: 0) {
            Text("Shipping details").font(.system(size: 14)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Name:", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 8.0)
            HStack(alignment: .center, spacing: 0) {
              VStack(alignment: .leading, spacing: 8) {
                /* TODO: TextInputLayout label */
                TextField("Street", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
              }
              .frame(maxWidth: .infinity)
              VStack(alignment: .leading, spacing: 8) {
                /* TODO: TextInputLayout label */
                TextField("House code", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
              }
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            HStack(alignment: .center, spacing: 0) {
              VStack(alignment: .leading, spacing: 8) {
                /* TODO: TextInputLayout label */
                TextField("City", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
              }
              .frame(maxWidth: .infinity)
              VStack(alignment: .leading, spacing: 8) {
                /* TODO: TextInputLayout label */
                TextField("ZIP", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
              }
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Phone", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 12.0)
            }
            .frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Email", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 8.0)
            }
            .frame(maxWidth: .infinity)
            VStack(alignment: .leading, spacing: 8) {
              /* TODO: TextInputLayout label */
              TextField("Note", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 12.0)
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          Color.clear
          .background(Color(red: 0.9490196078431372, green: 0.9490196078431372, blue: 0.9490196078431372, opacity: 1))
          .frame(height: 16.0)
          .padding(.top, 8.0)
          .padding(.bottom, 8.0)
          VStack(alignment: .leading, spacing: 0) {
            HStack(alignment: .center, spacing: 0) {
              Text("Click on Order to allow our <b><font color=#ee1f65>Terms and Conditions</b>").font(.system(size: 10)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
              VStack(alignment: .leading, spacing: 0) {
                Text("9995 USD").font(.system(size: 14)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.trailing)
                Text("inc. VAT").font(.system(size: 13)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing)
              }
              .padding(.leading, 8.0)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 16.0)
            .padding(.bottom, 16.0)
            Button(action: { }) {
              Text("Finish order").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            }
            .disabled(false)
            .buttonStyle(.borderedProminent)
            .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 16.0)
        .padding(.bottom, 16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_order_create_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_order_create()
  }
}
