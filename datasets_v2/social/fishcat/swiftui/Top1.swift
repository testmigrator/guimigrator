import SwiftUI

struct Top1: View {
  var body: some View {
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
  }
}

struct Top1_Previews: PreviewProvider {
  static var previews: some View {
    Top1()
  }
}
