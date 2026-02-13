import SwiftUI

struct Fragment_account: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Text("Name:").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1))
          Text("User and Surname").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
          Text("Address:").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).padding(.top, 16.0)
          Text("Brnenska 14, Brno, 61200").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).padding(.trailing, 6.0)
          Text("Email:").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).padding(.top, 16.0)
          Text("test@mailing.com").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
          Text("Phone:").font(.system(size: 12)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).padding(.top, 16.0)
          Text("903578123").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1))
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Button(action: { }) {
              Text("Account").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            }
            .disabled(false)
            .buttonStyle(.bordered)
            .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
            .frame(maxWidth: .infinity)
            Spacer()
            .frame(width: 16.0)
            Button(action: { }) {
              Text("My orders").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            }
            .disabled(false)
            .buttonStyle(.bordered)
            .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 16.0)
          HStack(alignment: .center, spacing: 0) {
            Button(action: { }) {
              Text("Branches").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            }
            .disabled(false)
            .buttonStyle(.bordered)
            .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
            .frame(maxWidth: .infinity)
            Spacer()
            .frame(width: 16.0)
            Button(action: { }) {
              Text("Settings").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            }
            .disabled(false)
            .buttonStyle(.bordered)
            .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 16.0)
          Group {
          Button(action: { }) {
            Text("Log in").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .disabled(false)
          .buttonStyle(.borderedProminent)
          .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
          .frame(maxWidth: .infinity)
          .padding(.top, 16.0)
          }
          .frame(maxWidth: .infinity, alignment: .center)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 16.0)
      }
      .frame(maxWidth: .infinity)
      .padding(16.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Fragment_account_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_account()
  }
}
