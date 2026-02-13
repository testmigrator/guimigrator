import SwiftUI

struct Fragment_category: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          ZStack {
            Group {
            VStack(alignment: .leading, spacing: 0) {
            }
            .background(Color.clear)
            .padding(.top, 10.0)
            .padding(.bottom, 10.0)
            }
            .frame(maxWidth: .infinity, alignment: .leading)
            Image("filter_unselected").background(Color.clear).padding(10.0).frame(maxWidth: .infinity, alignment: .center)
            Group {
            Picker("", selection: .constant(0)) {
              Text("Select").tag(0)
              Text("Option 1").tag(1)
              Text("Option 2").tag(2)
              Text("Option 3").tag(3)
            }
            .pickerStyle(.menu)
            .background(Image("spinner_background_black").resizable().scaledToFill())
            .padding(.top, 10.0)
            .padding(.bottom, 10.0)
            }
            .frame(maxWidth: .infinity, alignment: .trailing)
          }
          .frame(maxWidth: .infinity)
        }
        .background(Color(red: 0.9490196078431372, green: 0.9490196078431372, blue: 0.9490196078431372, opacity: 1))
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
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_category_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_category()
  }
}
