import SwiftUI

struct Item_split_entry: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("$").font(.system(size: 22)).foregroundColor(Color(red: 0.7568627450980392, green: 0.10588235294117647, blue: 0.09019607843137255, opacity: 1)).multilineTextAlignment(.center).padding(.bottom, 10.0)
        TextField("Amount", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity).padding(.bottom, 10.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        Image("ic_close_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 6.0).padding(.bottom, 22.0)
      }
      .frame(maxWidth: .infinity)
      VStack(alignment: .leading, spacing: 8) {
        /* TODO: TextInputLayout label */
        TextField("Memo", text: .constant("")).background(Color.clear).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 7.0)
      Picker("", selection: .constant(0)) {
        Text("Select").tag(0)
        Text("Option 1").tag(1)
        Text("Option 2").tag(2)
        Text("Option 3").tag(3)
      }
      .pickerStyle(.menu)
      .frame(maxWidth: .infinity)
      Rectangle().foregroundColor(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
      .background(Color(red: 1, green: 0.6705882352941176, blue: 0, opacity: 1))
      .frame(height: 2.0)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Item_split_entry_Previews: PreviewProvider {
  static var previews: some View {
    Item_split_entry()
  }
}
