import SwiftUI

struct Fragment_host_editor: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("Protocol").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("ssh").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 20.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        HStack(alignment: .center, spacing: 0) {
          VStack(alignment: .leading, spacing: 8) {
            /* TODO: TextInputLayout label */
            TextField("", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          Group {
          Button(action: { /* TODO */ }) {
            Image("ic_expand_more")
          }
          .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
          .frame(width: 48.0, height: 48.0)
          .padding(16.0)
          }
          .frame(maxHeight: .infinity, alignment: .center)
        }
        .frame(maxWidth: .infinity)
        .padding(.leading, 68.0)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          VStack(alignment: .leading, spacing: 8) {
            /* TODO: TextInputLayout label */
            TextField("\"Nickname\"", text: .constant("")).frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.leading, 68.0)
          .padding(.trailing, 16.0)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"Color category\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("gray").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 20.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"Font size (pt)\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          HStack(alignment: .center, spacing: 0) {
            Group {
            VStack(alignment: .leading, spacing: 0) {
            }
            .frame(maxWidth: .infinity)
            }
            .frame(maxHeight: .infinity, alignment: .center)
            TextField("", text: .constant("")).frame(width: 48.0, height: 48.0).padding(.trailing, 16.0).frame(maxHeight: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(.bottom, 8.0)
          .padding(.leading, 62.0)
          .padding(.top, 36.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"Use pubkey authentication\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("Use any key").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 20.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"DEL Key\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("Delete").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 20.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"Encoding\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("UTF-8").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 20.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        ZStack {
          Image(systemName: "photo").resizable().scaledToFit().frame(width: 24.0, height: 24.0).padding(.leading, 16.0).frame(maxWidth: .infinity, alignment: .leading)
          Text("\"Post-login automation\"").font(.system(size: 16)).foregroundColor(Color.clear).padding(.top, 20.0).padding(.leading, 72.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Text("\"Commands to run on remote server once authenticated\"").font(.system(size: 14)).foregroundColor(Color.clear).padding(.bottom, 2.0).padding(.leading, 72.0).padding(.top, 36.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          TextField("", text: .constant("")).frame(maxWidth: .infinity).padding(.leading, 72.0).padding(.top, 16.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_host_editor_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_host_editor()
  }
}
