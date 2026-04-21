import SwiftUI

struct Fragment_blog_detail: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        ScrollView {
          VStack(alignment: .leading, spacing: 0) {
            VStack(alignment: .leading, spacing: 0) {
            }
            .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        Group {
        VStack(alignment: .leading, spacing: 0) {
          Button(action: { /* TODO */ }) {
            Image("main_zoomin")
          }
          .background(Image("main_topbtn_up").resizable().scaledToFill())
          Button(action: { /* TODO */ }) {
            Image("main_zoomout")
          }
          .background(Image("main_bottombtn_up").resizable().scaledToFill())
        }
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
        Group {
        ZStack {
          Rectangle().foregroundColor(Color(red: 0.9137254901960784, green: 0.9372549019607843, blue: 0.9529411764705882, opacity: 1))
          .background(Color(red: 0.9137254901960784, green: 0.9372549019607843, blue: 0.9529411764705882, opacity: 1))
          .frame(height: 1.0)
          HStack(alignment: .center, spacing: 0) {
            ZStack {
              Image("ic_reply").frame(maxWidth: .infinity, alignment: .center)
            }
            .frame(maxWidth: .infinity)
            ZStack {
              Image("ic_dianzan")
              Text("45").frame(maxWidth: .infinity, alignment: .trailing)
            }
            .frame(maxWidth: .infinity)
            ZStack {
              Image("ic_comment")
              Text("45").frame(maxWidth: .infinity, alignment: .trailing)
            }
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity)
          .padding(.leading, 12.0)
          .padding(.trailing, 12.0)
        }
        .background(Color.clear)
        .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .background(Color.clear)
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_blog_detail_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_blog_detail()
  }
}
