import SwiftUI

struct Watch_item: View {
  var body: some View {
    ZStack {
      Group {
      Button(action: { /* TODO */ }) {
        Image("ic_action_watch_item_add_default")
      }
      .background(Color.clear)
      .padding(.top, 20.0)
      .padding(.bottom, 20.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
      Group {
      HStack(alignment: .center, spacing: 0) {
        Image(systemName: "photo").padding(.top, 13.0)
        VStack(alignment: .leading, spacing: 0) {
          ZStack {
            Text("").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
            Text("").font(.system(size: 18)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
          }
          .frame(maxWidth: .infinity)
          Text("").font(.system(size: 12))
          Text("").font(.system(size: 12)).foregroundColor(Color.clear)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
        .padding(.bottom, 10.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Watch_item_Previews: PreviewProvider {
  static var previews: some View {
    Watch_item()
  }
}
