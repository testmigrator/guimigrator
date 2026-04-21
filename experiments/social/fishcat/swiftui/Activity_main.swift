import SwiftUI

struct Activity_main: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Group {
        HStack(alignment: .center, spacing: 0) {
          Image("logo")
          Text("鱼传").font(.system(size: 22)).foregroundColor(Color(red: 0.8274509803921568, green: 0.8274509803921568, blue: 0.8274509803921568, opacity: 1)).padding(.leading, 5.0)
        }
        }
        .frame(maxWidth: .infinity, alignment: .leading)
        Group {
        HStack(alignment: .center, spacing: 0) {
          Image("actionbar_search_icon").resizable().scaledToFit().frame(width: 30.0, height: 30.0)
          Image("actionbar_add_icon").resizable().scaledToFit().frame(width: 30.0, height: 30.0)
          Image("actionbar_more_icon").resizable().scaledToFit().frame(width: 30.0, height: 30.0)
        }
        }
        .frame(maxWidth: .infinity, alignment: .trailing)
      }
      .background(Image("top1_bg").resizable().scaledToFill())
      .frame(maxWidth: .infinity)
      .frame(height: 50.0)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .leading, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
          HStack(alignment: .center, spacing: 0) {
            Text("聊天").foregroundColor(Color(red: 0, green: 0.5019607843137255, blue: 0, opacity: 1))
          }
          .frame(maxHeight: .infinity)
          .frame(width: 3.0)
          .frame(maxWidth: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("通讯录").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
          }
          .frame(maxHeight: .infinity)
          .frame(width: 3.0)
          .frame(maxWidth: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("发现").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
          }
          .frame(maxHeight: .infinity)
          .frame(width: 3.0)
          .frame(maxWidth: .infinity)
          HStack(alignment: .center, spacing: 0) {
            Text("我").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
          }
          .frame(maxHeight: .infinity)
          .frame(width: 3.0)
          .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .frame(height: 37.0)
        Image("tabline").resizable().scaledToFit().frame(width: 100.0, height: 3.0)
      }
      .background(Color.clear)
      .frame(maxWidth: .infinity)
      .frame(height: 40.0)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_main_Previews: PreviewProvider {
  static var previews: some View {
    Activity_main()
  }
}
