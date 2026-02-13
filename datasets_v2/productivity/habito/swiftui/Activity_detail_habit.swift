import SwiftUI

struct Activity_detail_habit: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Group {
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .padding(.trailing, 16.0)
        .padding(.top, 8.0)
        }
        .frame(maxWidth: .infinity, alignment: .trailing)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .frame(height: 300.0)
        .padding(.leading, 8.0)
        .padding(.trailing, 8.0)
        Text("6 Feb 2017 - 12 Feb 2017").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 8.0)
        HStack(alignment: .center, spacing: 0) {
          Button(action: { /* TODO */ }) {
            Image("ic_minus_gray")
          }
          .padding(.trailing, 16.0)
          Text("0").font(.system(size: 80))
          Button(action: { /* TODO */ }) {
            Image("ic_plus_gray")
          }
          .padding(.leading, 16.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 16.0)
        .padding(.top, -12.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_detail_habit_Previews: PreviewProvider {
  static var previews: some View {
    Activity_detail_habit()
  }
}
