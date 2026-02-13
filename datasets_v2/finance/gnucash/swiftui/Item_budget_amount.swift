import SwiftUI

struct Item_budget_amount: View {
  var body: some View {
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
  }
}

struct Item_budget_amount_Previews: PreviewProvider {
  static var previews: some View {
    Item_budget_amount()
  }
}
