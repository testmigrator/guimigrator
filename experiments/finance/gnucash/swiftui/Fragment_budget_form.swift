import SwiftUI

struct Fragment_budget_form: View {
  var body: some View {
    ZStack {
      Group {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          VStack(alignment: .leading, spacing: 8) {
            /* TODO: TextInputLayout label */
            TextField("Budget name", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Image("ic_action_sort_by_size").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
            TextField("Description", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          Rectangle().foregroundColor(Color.gray.opacity(0.35))
          .background(Color.gray.opacity(0.35))
          .frame(height: 1.0)
          .padding(.leading, 50.0)
          HStack(alignment: .center, spacing: 0) {
            Image("ic_action_rotate_right").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
            Text("Set budget period").multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          HStack(alignment: .center, spacing: 0) {
            Text("START").frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
            Text("29.11.2015").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(3.0)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          VStack(alignment: .leading, spacing: 0) {
            VStack(alignment: .leading, spacing: 0) {
              HStack(alignment: .center, spacing: 0) {
                Text("$").font(.system(size: 22)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.trailing, 10.0)
                TextField("Amount", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity)
                Image("ic_close_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 6.0).padding(.bottom, 22.0)
              }
              .frame(maxWidth: .infinity)
              .padding(10.0)
              Rectangle().foregroundColor(Color.gray.opacity(0.35))
              .background(Color.gray.opacity(0.35))
              .frame(height: 1.0)
              .padding(.leading, 50.0)
              HStack(alignment: .center, spacing: 0) {
                Image("ic_action_forward").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
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
              .padding(10.0)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .padding(5.0)
          }
          .frame(maxWidth: .infinity)
          Button(action: { }) {
            Text("Add Budget Amounts").foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
          }
          .disabled(false)
          .buttonStyle(.plain)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, alignment: .leading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_budget_form_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_budget_form()
  }
}
