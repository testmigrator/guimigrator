import SwiftUI

struct About: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .center, spacing: 0) {
        Text("HN").font(.system(size: 80)).foregroundColor(Color(red: 0.4745098039215686, green: 0.4745098039215686, blue: 0.4745098039215686, opacity: 1))
        Text("by Creative Pragmatics").font(.system(size: 22)).foregroundColor(Color(red: 0.4745098039215686, green: 0.4745098039215686, blue: 0.4745098039215686, opacity: 1)).padding(.top, 8.0)
        Text("").font(.system(size: 22)).foregroundColor(Color(red: 0.4745098039215686, green: 0.4745098039215686, blue: 0.4745098039215686, opacity: 1)).padding(.top, 8.0)
        Text("").font(.system(size: 16)).foregroundColor(Color(red: 0.4745098039215686, green: 0.4745098039215686, blue: 0.4745098039215686, opacity: 1)).padding(.top, 50.0)
      }
      .background(Color(red: 1, green: 0.9294117647058824, blue: 0.8588235294117647, opacity: 1))
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct About_Previews: PreviewProvider {
  static var previews: some View {
    About()
  }
}
