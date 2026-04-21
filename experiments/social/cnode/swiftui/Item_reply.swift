import SwiftUI

struct Item_reply: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(width: 30.0, height: 30.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.center).padding(5.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Text("").font(.system(size: 14)).foregroundColor(Color.clear).multilineTextAlignment(.center).padding(5.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 30.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
      }
      .frame(maxWidth: .infinity)
      .padding(.leading, 10.0)
      .padding(.trailing, 10.0)
      .padding(.top, 10.0)
      .padding(.bottom, 5.0)
      Rectangle().foregroundColor(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .background(Color(red: 0.5098039215686274, green: 0.7333333333333333, blue: 0.13333333333333333, opacity: 1))
      .frame(height: 0.5)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Item_reply_Previews: PreviewProvider {
  static var previews: some View {
    Item_reply()
  }
}
