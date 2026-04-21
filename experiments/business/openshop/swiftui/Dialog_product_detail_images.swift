import SwiftUI

struct Dialog_product_detail_images: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      ZStack {
        Image("ic_media_ff").padding(8.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Image("ic_media_rew").padding(8.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        Button(action: { }) {
          Text("Close").font(.system(size: 18)).foregroundColor(Color(red: 0.9333333333333333, green: 0.12156862745098039, blue: 0.396078431372549, opacity: 1))
        }
        .disabled(false)
        .background(Color(red: 0, green: 0, blue: 0, opacity: 0))
        .padding(7.0)
        }
        .frame(maxWidth: .infinity, alignment: .center)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Dialog_product_detail_images_Previews: PreviewProvider {
  static var previews: some View {
    Dialog_product_detail_images()
  }
}
