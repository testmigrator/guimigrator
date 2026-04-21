import SwiftUI

struct Activity_habit_list: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      ScrollView {
        LazyVStack(alignment: .leading, spacing: 4) {
          ForEach(1...10, id: \.self) { idx in
            VStack(alignment: .leading, spacing: 2) {
              Text("Item \(idx)")
              Text("Sub Item \(idx)")
            }
            Divider()
          }
        }
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(.bottom, 8.0)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(16.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      ProgressView().frame(maxWidth: .infinity, alignment: .center)
      Text("No data available.").foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_habit_list_Previews: PreviewProvider {
  static var previews: some View {
    Activity_habit_list()
  }
}
