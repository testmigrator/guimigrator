import SwiftUI

struct List_cell_blog: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      Text("JAVA异常处理、常用类、反射、集合").font(.system(size: 18)).foregroundColor(Color(red: 0.12941176470588237, green: 0.5882352941176471, blue: 0.9529411764705882, opacity: 1)).frame(maxWidth: .infinity, alignment: .leading)
      HStack(alignment: .center, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(width: 50.0, height: 50.0)
        .padding(2.0)
        .padding(.trailing, 8.0)
        Text("想到用python发送邮件主要是服务器 有时候会产生coredump文件 ，然后因为脚本重启原因，服务器coredump产生后会重启但是没有主动通知开发人员想了下可以写个脚本一旦产生coredump文件就可以发送邮件给开发者让其立马知道下面只介绍简单的发送脚本如果需要在生产环境用起来 还需要按要求修...").foregroundColor(Color(red: 0.4588235294117647, green: 0.4588235294117647, blue: 0.4588235294117647, opacity: 1))
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 8.0)
      .padding(.bottom, 8.0)
      HStack(alignment: .center, spacing: 0) {
        Text("作者 : ").foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1))
        Text("激荡的天石").font(.system(size: 10)).foregroundColor(Color(red: 0.23137254901960785, green: 0.43137254901960786, blue: 0.4588235294117647, opacity: 1))
      }
      .frame(maxWidth: .infinity)
      .padding(.top, 2.0)
      ZStack {
        Text("发布时间: ").font(.system(size: 10)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.trailing, 5.0)
        Text("2015-04-19 14:52").font(.system(size: 10)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        Text("评论 (%d)").font(.system(size: 10)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).padding(.trailing, 5.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("阅读 (%d)").font(.system(size: 10)).foregroundColor(Color(red: 0, green: 0, blue: 0, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
      }
      .frame(maxWidth: .infinity)
    }
    .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(16.0)
  }
}

struct List_cell_blog_Previews: PreviewProvider {
  static var previews: some View {
    List_cell_blog()
  }
}
