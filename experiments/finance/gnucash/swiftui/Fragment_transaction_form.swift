import SwiftUI

struct Fragment_transaction_form: View {
  var body: some View {
    ZStack {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            /* AutoComplete requires data source (adapter) */
            TextField("Description", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          Rectangle().foregroundColor(Color.gray.opacity(0.35))
          .background(Color.gray.opacity(0.35))
          .frame(height: 1.0)
          .padding(.leading, 0.0)
          HStack(alignment: .center, spacing: 0) {
            Text("$").font(.system(size: 22)).foregroundColor(Color(red: 0.7568627450980392, green: 0.10588235294117647, blue: 0.09019607843137255, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).padding(.trailing, 10.0)
            TextField("Amount", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity)
            Image("content_split_holo_light")
            VStack(alignment: .leading, spacing: 0) {
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
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
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          Rectangle().foregroundColor(Color.gray.opacity(0.35))
          .background(Color.gray.opacity(0.35))
          .frame(height: 1.0)
          .padding(.leading, 50.0)
          HStack(alignment: .center, spacing: 0) {
            Image("ic_action_time").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
            Text("").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
          Rectangle().foregroundColor(Color.gray.opacity(0.35))
          .background(Color.gray.opacity(0.35))
          .frame(height: 1.0)
          .padding(.leading, 50.0)
          HStack(alignment: .center, spacing: 0) {
            Image("ic_action_sort_by_size").resizable().scaledToFit().frame(maxWidth: .infinity).padding(.trailing, 10.0)
            TextField("Add note", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity)
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
            Text("Tap to create schedule").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 10.0)
          .padding(.bottom, 10.0)
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_transaction_form_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_transaction_form()
  }
}
