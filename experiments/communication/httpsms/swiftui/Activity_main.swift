import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(width: 147.0, height: 92.0).padding(.top, 16.0)
      Text("httpsms.com - %s").padding(.top, 16.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("Phone Number").font(.system(size: 28)).foregroundColor(Color.clear)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          Text("23/06/2022 18:58:30").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 8.0)
        }
        .frame(maxWidth: .infinity)
        .padding(16.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 24.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("Phone Number").font(.system(size: 28)).foregroundColor(Color.clear)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
          Text("23/06/2022 18:58:30").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 8.0)
        }
        .frame(maxWidth: .infinity)
        .padding(16.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 24.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(10.0)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 4.0)
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 16.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(10.0)
      .padding(.bottom, 16.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
