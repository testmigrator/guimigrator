import SwiftUI

struct Dialog_order_create_success: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("Thank you for your order").font(.system(size: 20)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.leading).padding(10.0).padding(.top, 5.0).frame(maxWidth: .infinity, alignment: .center)
      Text("Wait for <b>SMS</b> or <b>email</b> order confirmation.").font(.system(size: 16)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.center).padding(14.0).padding(.top, 7.0).frame(maxWidth: .infinity, alignment: .center)
      Group {
      Button(action: { }) {
        Text("@android:string/ok").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1))
      }
      .disabled(false)
      .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(.top, 15.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_order_create_success_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_order_create_success()
  }
}
