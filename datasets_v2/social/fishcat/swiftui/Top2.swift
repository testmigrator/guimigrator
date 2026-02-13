import SwiftUI

struct Top2: View {
  var body: some View {
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
}

struct Top2_Previews: PreviewProvider {
  static var previews: some View {
    Top2()
  }
}
