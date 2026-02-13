import SwiftUI

struct Main_more_content: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Button(action: { }) {
        Text("Settings").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .background(Color(red: 0.5294117647058824, green: 0.12156862745098039, blue: 0.03137254901960784, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(16.0)
      .padding(.bottom, 1.0)
      Button(action: { }) {
        Text("About").font(.system(size: 18)).foregroundColor(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading)
      }
      .disabled(false)
      .background(Color(red: 0.5294117647058824, green: 0.12156862745098039, blue: 0.03137254901960784, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Main_more_content_Previews: PreviewProvider {
  static var previews: some View {
    Main_more_content()
  }
}
