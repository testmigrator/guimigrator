import SwiftUI

struct Comment: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        ZStack {
          Group {
          HStack(alignment: .center, spacing: 0) {
            Text("").font(.system(size: 14)).foregroundColor(Color.clear)
            Text("").frame(width: 4.0)
            Text("").font(.system(size: 14)).foregroundColor(Color.clear).padding(.leading, 10.0)
          }
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          Group {
          HStack(alignment: .center, spacing: 0) {
            Text("").font(.system(size: 14)).foregroundColor(Color.clear)
            HStack(alignment: .center, spacing: 0) {
            }
            .background(Image("comment").resizable().scaledToFill())
            .frame(width: 14.0, height: 14.0)
            .padding(.leading, 2.0)
            .padding(.top, 3.0)
          }
          .background(Image("tag").resizable().scaledToFill())
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 16.0)
        .padding(.bottom, 8.0)
        Text("").font(.system(size: 15)).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 16.0)
        HStack(alignment: .center, spacing: 0) {
        }
        .background(Color.gray.opacity(0.35))
        .frame(maxWidth: .infinity)
        .frame(height: 1.0)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Comment_Previews: PreviewProvider {
  static var previews: some View {
    Comment()
  }
}
