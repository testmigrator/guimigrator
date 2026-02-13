import SwiftUI

struct Settings: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Image("back").padding(.top, 8.0).padding(.bottom, 8.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("Settings").font(.system(size: 24)).foregroundColor(Color.white).frame(maxWidth: .infinity, alignment: .center)
      }
      .background(Image("actionbar_bg_orange").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .frame(height: 48.0)
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
      .background(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1))
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Settings_Previews: PreviewProvider {
  static var previews: some View {
    Settings()
  }
}
