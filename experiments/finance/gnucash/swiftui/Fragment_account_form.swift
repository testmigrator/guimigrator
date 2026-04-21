import SwiftUI

struct Fragment_account_form: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 8) {
          /* TODO: TextInputLayout label */
          TextField("Account name", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 10.0)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          Text("Currency").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 8.0).padding(.trailing, 10.0)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
        }
        .padding(.bottom, 10.0)
        Text("Account Color & Type").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).padding(.trailing, 16.0).padding(.bottom, -8.0)
        HStack(alignment: .center, spacing: 0) {
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .frame(width: 40.0, height: 40.0)
          .padding(.leading, 8.0)
          }
          .frame(maxHeight: .infinity, alignment: .center)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
          .padding(.leading, 10.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 10.0)
        VStack(alignment: .leading, spacing: 8) {
          /* TODO: TextInputLayout label */
          TextField("Account description", text: .constant("")).frame(maxWidth: .infinity).padding(.bottom, 10.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.leading, 9.0)
        .padding(.bottom, 10.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 10.0)
        Text("Parent account").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).padding(.trailing, 16.0)
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
          }
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 10.0)
        Text("Default Transfer Account").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).padding(.trailing, 16.0)
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .leading, spacing: 0) {
          }
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_account_form_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_account_form()
  }
}
