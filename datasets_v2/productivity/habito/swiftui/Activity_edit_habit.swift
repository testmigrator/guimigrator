import SwiftUI

struct Activity_edit_habit: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      HStack(alignment: .center, spacing: 0) {
        Text("Name").foregroundColor(Color(red: 1, green: 0.25098039215686274, blue: 0.5058823529411764, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.top, 16.0)
        TextField("Which habit?", text: .constant("")).frame(maxWidth: .infinity)
        Group {
        Button(action: { /* TODO */ }) {
          Image("ic_palette")
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        }
        .frame(maxHeight: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      HStack(alignment: .center, spacing: 0) {
        Text("Reset to zero").foregroundColor(Color(red: 1, green: 0.25098039215686274, blue: 0.5058823529411764, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.top, 16.0)
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
      .padding(.top, 16.0)
      HStack(alignment: .center, spacing: 0) {
        Text("Target").foregroundColor(Color(red: 1, green: 0.25098039215686274, blue: 0.5058823529411764, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.top, 16.0)
        TextField("Your target", text: .constant("")).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      HStack(alignment: .center, spacing: 0) {
        Text("Reminder").foregroundColor(Color(red: 1, green: 0.25098039215686274, blue: 0.5058823529411764, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(.top, 16.0)
        Text("Off").font(.system(size: 18)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_edit_habit_Previews: PreviewProvider {
  static var previews: some View {
    Activity_edit_habit()
  }
}
