import SwiftUI

struct Fragment_export_form: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Export To:").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 8.0)
          Picker("", selection: .constant(0)) {
            Text("Select").tag(0)
            Text("Option 1").tag(1)
            Text("Option 2").tag(2)
            Text("Option 3").tag(3)
          }
          .pickerStyle(.menu)
          .frame(maxWidth: .infinity)
          .padding(.leading, 15.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, -8.0)
        Text("/path/to/export/file").font(.system(size: 12)).foregroundColor(Color(red: 0.19215686274509805, green: 0.615686274509804, blue: 0.403921568627451, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 10.0).padding(.leading, 100.0).padding(.top, -8.0)
        HStack(alignment: .center, spacing: 0) {
          Text(" Format").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 8.0)
          HStack(alignment: .leading, spacing: 8) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("CSV", isOn: .constant(false)).padding(.trailing, 20.0)
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("QIF", isOn: .constant(false)).padding(.trailing, 20.0)
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("XML", isOn: .constant(false)).padding(.trailing, 20.0)
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("OFX", isOn: .constant(false)).padding(.trailing, 20.0)
          }
          .frame(maxWidth: .infinity)
          .padding(.leading, 35.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, -8.0)
        Text("Some format-based export warning").font(.system(size: 12)).foregroundColor(Color(red: 0.19215686274509805, green: 0.615686274509804, blue: 0.403921568627451, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 10.0).padding(.leading, 100.0).padding(.top, -8.0).padding(.bottom, -8.0)
        HStack(alignment: .center, spacing: 0) {
          Text("Separator").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 8.0)
          HStack(alignment: .leading, spacing: 8) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle(",", isOn: .constant(false)).padding(.trailing, 20.0)
            /* TODO: RadioButton -> Toggle fallback */
            Toggle(";", isOn: .constant(false)).padding(.trailing, 20.0)
            /* TODO: RadioButton -> Toggle fallback */
            Toggle(":", isOn: .constant(false)).padding(.trailing, 20.0)
          }
          .frame(maxWidth: .infinity)
          .padding(.leading, 35.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, -8.0)
        HStack(alignment: .center, spacing: 0) {
          Text("Since").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).multilineTextAlignment(.center).padding(.leading, 8.0).padding(.trailing, 8.0)
          Text("25.12.2015").font(.system(size: 15)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
          Text("15:30H").font(.system(size: 15)).foregroundColor(Color.black).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity)
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.leading, 5.0)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
        .padding(.bottom, 10.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .padding(.top, 20.0)
        VStack(alignment: .leading, spacing: 0) {
          Spacer()
          Text("Recurrence").font(.system(size: 14)).foregroundColor(Color(red: 0.6666666666666666, green: 0.6666666666666666, blue: 0.6666666666666666, opacity: 1)).padding(.leading, 8.0)
          Text("Tap to create schedule").multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          Spacer()
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
        .padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 10.0)
      .padding(.trailing, 10.0)
      .padding(.top, 10.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_export_form_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_export_form()
  }
}
