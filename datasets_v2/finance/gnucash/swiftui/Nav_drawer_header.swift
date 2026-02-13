import SwiftUI

struct Nav_drawer_header: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("").font(.system(size: 20)).foregroundColor(Color.white).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(16.0)
      Text("Current Book Name").font(.system(size: 16)).foregroundColor(Color.white).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).padding(5.0).padding(.leading, 10.0)
    }
    .background(Color(red: 0.1803921568627451, green: 0.49019607843137253, blue: 0.19607843137254902, opacity: 1))
    .frame(maxWidth: .infinity)
    .frame(height: 100.0)
  }
}

struct Nav_drawer_header_Previews: PreviewProvider {
  static var previews: some View {
    Nav_drawer_header()
  }
}
