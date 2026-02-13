import SwiftUI

struct Activity_about: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Image("app_logo").resizable().scaledToFit().frame(width: 80.0, height: 80.0).frame(maxWidth: .infinity, alignment: .center)
        Text("干货集中营").font(.system(size: 20)).padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("每天为大家分享 IT 干货").padding(.top, 10.0).frame(maxWidth: .infinity, alignment: .center)
        Text("背景")
        Text("最早是干货集中营邮件订阅日报，但是发现很多小伙伴的邮箱收不到，随即开发这个轻量的 App，让大家畅通接收干货。")
        Text("获取")
        Text("干货会在每天中午12：00 - 12：30之间通过推送的方式发给所有App。")
        Text("开源")
        Text("干货集中营 Android 以及 iOS 版本的 App 都是开源的，你可以选择成为干货编辑或者成为干货 App 的开发者为干货集中营贡献力量。开源地址： github.com/ganhuo")
        Text("组织")
        Text("每天干活战斗小组的编辑们会在清晨，打开 GitHub，采摘一个又一个美味的干货。如果你也想加入干货战斗小组，联络我的微信：daimajia")
        Text("最后")
        Text("感谢所有的编辑们和为此付出的开发者们。")
      }
      .frame(maxWidth: .infinity)
      .padding(20.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Activity_about_Previews: PreviewProvider {
  static var previews: some View {
    Activity_about()
  }
}
