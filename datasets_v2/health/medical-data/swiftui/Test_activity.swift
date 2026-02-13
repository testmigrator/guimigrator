import SwiftUI

struct Test_activity: View {
  var body: some View {
    ScrollView {
      ZStack {
        ZStack {
          Text("Affective state").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Motivation").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Concentration").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Anxiety").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Irritability").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Sleep quality").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Group {
          ZStack {
            Text("Menstruation").padding(.top, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
            Group {
            Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
            .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
            .frame(height: 2.0)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
            Group {
            HStack(alignment: .leading, spacing: 8) {
              /* TODO: RadioButton -> Toggle fallback */
              Toggle("No", isOn: .constant(false))
              /* TODO: RadioButton -> Toggle fallback */
              Toggle("Yes", isOn: .constant(false)).padding(.leading, 70.0)
            }
            .padding(.top, 15.0)
            .padding(.top, 2.0)
            }
            .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          }
          .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("Caffeine").padding(.top, 30.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 5.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Alcohol").padding(.top, 30.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 5.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Cigarettes").padding(.top, 25.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 5.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Other drugs").padding(.top, 25.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          HStack(alignment: .leading, spacing: 8) {
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("No", isOn: .constant(false))
            /* TODO: RadioButton -> Toggle fallback */
            Toggle("Yes", isOn: .constant(false)).padding(.leading, 70.0)
          }
          .padding(.top, 15.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Time to go to bed").padding(.top, 30.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Time to sleep").padding(.top, 30.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("Time to wake up").padding(.top, 30.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Image("ic_menu_help").padding(.leading, 10.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 2.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Group {
          Rectangle().foregroundColor(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .background(Color(red: 0.7529411764705882, green: 0.7529411764705882, blue: 0.7529411764705882, opacity: 1))
          .frame(height: 2.0)
          .padding(.top, 50.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          Button(action: { }) {
            Text("SEND")
          }
          .disabled(false)
          .padding(.top, 30.0)
          .padding(.top, 52.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
          Text("").foregroundColor(Color(red: 0.9137254901960784, green: 0.11764705882352941, blue: 0.38823529411764707, opacity: 1)).multilineTextAlignment(.center).padding(.top, 20.0).padding(.bottom, 20.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
        }
        .frame(maxWidth: .infinity)
        .padding(.leading, 16.0)
        .padding(.trailing, 16.0)
        .padding(.top, 16.0)
        .padding(.bottom, 16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Test_activity_Previews: PreviewProvider {
  static var previews: some View {
    Test_activity()
  }
}
