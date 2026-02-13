import SwiftUI

struct Dialog_map: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("Pobocka v Brne").font(.system(size: 15)).foregroundColor(Color(red: 0.12941176470588237, green: 0.12941176470588237, blue: 0.12941176470588237, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity).padding(8.0)
          Image("close_black").background(Color.clear).padding(8.0)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          ZStack {
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          Image(systemName: "photo").resizable().scaledToFit().frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 290.0)
        VStack(alignment: .leading, spacing: 0) {
          Text("Bratislavska 14, Brno").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(maxWidth: .infinity, alignment: .center)
          VStack(alignment: .leading, spacing: 0) {
            Text("").font(.system(size: 13)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(.top, 8.0)
          .padding(.bottom, 8.0)
          Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.4470588235294118, green: 0.4470588235294118, blue: 0.4470588235294118, opacity: 1)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).padding(.top, 8.0).padding(.bottom, 8.0).frame(maxWidth: .infinity, alignment: .center)
        }
        .frame(maxWidth: .infinity)
        .padding(8.0)
        Button(action: { }) {
          Text("Select").font(.system(size: 16)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
        }
        .disabled(false)
        .buttonStyle(.borderedProminent)
        .background(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
      .padding(0.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_map_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_map()
  }
}
