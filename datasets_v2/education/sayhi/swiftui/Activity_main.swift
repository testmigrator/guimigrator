import SwiftUI

struct Activity_main: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .center, spacing: 0) {
        TextField("", text: .constant(""))
        Picker("", selection: .constant(0)) {
          Text("Select").tag(0)
          Text("Option 1").tag(1)
          Text("Option 2").tag(2)
          Text("Option 3").tag(3)
        }
        .pickerStyle(.menu)
        .frame(maxWidth: .infinity)
        .padding(.top, 20.0)
        VStack(alignment: .leading, spacing: 0) {
          Button(action: { }) {
            Text("SAY IT!").font(.system(size: 14)).foregroundColor(Color.clear)
          }
          .disabled(false)
          .background(Color.clear)
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 15.0)
        .padding(.bottom, 20.0)
        Text("Write it up!nAnd don't forget to give feedback and report bugs").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(.top, 15.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.bottom, 16.0)
      .padding(.top, 20.0)
    }
    .frame(maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
