import SwiftUI

struct Story_list_item: View {
  var body: some View {
    ZStack {
      Group {
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          Text("").font(.system(size: 14)).foregroundColor(Color.clear)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 5.0)
        Text("").font(.system(size: 16)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading).padding(.bottom, 5.0)
        HStack(alignment: .center, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
          }
          .background(Image("arrow_upward").resizable().scaledToFill())
          .frame(width: 13.0, height: 13.0)
          .padding(.top, 4.0)
          Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.5450980392156862, green: 0.7647058823529411, blue: 0.2901960784313726, opacity: 1)).padding(.leading, 2.0)
          HStack(alignment: .center, spacing: 0) {
          }
          .background(Image("comment").resizable().scaledToFill())
          .frame(width: 13.0, height: 13.0)
          .padding(.leading, 10.0)
          .padding(.top, 4.0)
          Text("").font(.system(size: 14)).foregroundColor(Color(red: 1, green: 0.6196078431372549, blue: 0.5019607843137255, opacity: 1)).padding(.leading, 2.0)
          Text("").font(.system(size: 14))
          Text("").font(.system(size: 14)).foregroundColor(Color.clear).padding(.leading, 10.0)
        }
      }
      .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
      Group {
      ZStack {
        Image("no_image").resizable().scaledToFit().frame(width: 64.0, height: 64.0)
        Image(systemName: "photo").resizable().scaledToFit().frame(width: 64.0, height: 64.0)
      }
      .frame(width: 64.0, height: 64.0)
      .padding(.leading, 20.0)
      }
      .frame(maxWidth: .infinity, alignment: .trailing)
    }
    .frame(maxWidth: .infinity)
    .padding(.top, 12.0)
    .padding(.bottom, 12.0)
  }
}

struct Story_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Story_list_item()
  }
}
