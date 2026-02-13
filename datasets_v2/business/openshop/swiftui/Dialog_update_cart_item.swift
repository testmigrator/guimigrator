import SwiftUI

struct Dialog_update_cart_item: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("Update:").font(.system(size: 19)).padding(.top, 10.0).padding(.bottom, 10.0)
        Text("").font(.system(size: 16)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.top, 10.0).padding(.bottom, 10.0).padding(.leading, 10.0)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Spacer()
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
          .frame(maxWidth: .infinity)
          .padding(.top, 4.0)
          .padding(.bottom, 4.0)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
          .frame(maxWidth: .infinity)
          .padding(.top, 4.0)
          .padding(.bottom, 4.0)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .background(Image("spinner_background_black_baseline").resizable().scaledToFill())
          .frame(maxWidth: .infinity)
          .padding(.top, 4.0)
          .padding(.bottom, 4.0)
          Spacer()
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { }) {
            Text("Cancel").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .disabled(false)
          .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
          .frame(maxWidth: .infinity)
          .padding(.top, 14.0)
          .padding(.bottom, 14.0)
          Button(action: { }) {
            Text("Save").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .disabled(false)
          .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
          .frame(maxWidth: .infinity)
          .padding(.top, 14.0)
          .padding(.bottom, 14.0)
          .padding(.leading, 15.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 15.0)
      }
      .frame(maxWidth: .infinity)
      ProgressView().padding(.top, 75.0).frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity)
    .padding(10.0)
  }
}

struct Dialog_update_cart_item_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_update_cart_item()
  }
}
