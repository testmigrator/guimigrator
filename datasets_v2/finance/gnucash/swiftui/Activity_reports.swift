import SwiftUI

struct Activity_reports: View {
  var body: some View {
    HStack(spacing: 0) {
      /* TODO: Drawer interaction (slide-in) */
      VStack {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxHeight: .infinity)
      }
      .frame(width: 280)
      Divider()
      VStack {
        ZStack {
          ScrollView {
            ZStack {
              ZStack {
                VStack(alignment: .leading, spacing: 0) {
                  Picker("", selection: .constant(0)) {
                    Text("Select").tag(0)
                    Text("Option 1").tag(1)
                    Text("Option 2").tag(2)
                    Text("Option 3").tag(3)
                  }
                  .pickerStyle(.menu)
                }
                .background(Color.clear)
                .frame(maxWidth: .infinity)
              }
              .frame(maxWidth: .infinity)
              Group {
              ZStack {
              }
              .frame(maxWidth: .infinity)
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          Group {
          Rectangle().foregroundColor(Color.clear)
          .background(Color.clear)
          .frame(height: 1.0)
          .padding(.top, 5.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          HStack(alignment: .center, spacing: 0) {
            Text("Period:").font(.system(size: 14)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity).frame(maxHeight: .infinity, alignment: .center)
            Picker("", selection: .constant(0)) {
              Text("Select").tag(0)
              Text("Option 1").tag(1)
              Text("Option 2").tag(2)
              Text("Option 3").tag(3)
            }
            .pickerStyle(.menu)
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            Picker("", selection: .constant(0)) {
              Text("Select").tag(0)
              Text("Option 1").tag(1)
              Text("Option 2").tag(2)
              Text("Option 3").tag(3)
            }
            .pickerStyle(.menu)
            .frame(maxWidth: .infinity, maxHeight: .infinity)
            .padding(.leading, 5.0)
          }
          .frame(maxWidth: .infinity)
          .frame(height: 120.0)
          .padding(10.0)
          .padding(.top, 6.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_reports_Previews: PreviewProvider {
  static var previews: some View {
    Activity_reports()
  }
}
