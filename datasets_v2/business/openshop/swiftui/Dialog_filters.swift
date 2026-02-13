import SwiftUI

struct Dialog_filters: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("FILTER").font(.system(size: 20)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 15.0)
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
      HStack(alignment: .center, spacing: 0) {
        Button(action: { }) {
          Text("Clear").font(.system(size: 16)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.bordered)
        .background(Color(red: 0.7372549019607844, green: 0.7372549019607844, blue: 0.7372549019607844, opacity: 1))
        .frame(maxWidth: .infinity)
        Spacer()
        .frame(width: 16.0, height: 5.0)
        Button(action: { }) {
          Text("Apply").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.borderedProminent)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
    .padding(16.0)
  }
}

struct Dialog_filters_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_filters()
  }
}
