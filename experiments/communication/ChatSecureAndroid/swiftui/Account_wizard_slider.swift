import SwiftUI

struct Account_wizard_slider: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .center, spacing: 0) {
        Text("title text goes here").frame(maxWidth: .infinity, alignment: .leading).padding(8.0)
        Text("the detailed body test describing the app will go here and weill apll prima").padding(8.0).padding(.top, 0.0)
        Button(action: { }) {
          Text("Add Account").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .frame(maxWidth: .infinity)
        .padding(.leading, 20.0)
        .padding(.trailing, 20.0)
      }
      .background(Color(red: 0.8, green: 0.8, blue: 0.8, opacity: 0.8666666666666667))
      .frame(maxWidth: .infinity)
      .padding(12.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(12.0)
  }
}

struct Account_wizard_slider_Previews: PreviewProvider {
  static var previews: some View {
    Account_wizard_slider()
  }
}
