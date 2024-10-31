import SwiftUI
struct activity_main_blog_list_item: View {

var body: some View {
VStack
{
Text("JAVA异常处理、常用类、反射、集合")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 18))
.foregroundColor(Color(red:0.12941177,green:0.5882353,blue:0.9529412,opacity:1.0))
HStack
{

Text("想到用python发送邮件主要是服务器 有时候会产生coredump文件 ，然后因为脚本重启原因，服务器coredump产生后会重启但是没有主动通知开发人员想了下可以写个脚本一旦产生coredump文件就可以发送邮件给开发者让其立马知道下面只介绍简单的发送脚本如果需要在生产环境用起来 还需要按要求修...")
.foregroundColor(Color(red:0.45882353,green:0.45882353,blue:0.45882353,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
.padding(.bottom,8)
HStack
{
Text("激荡的天石")
.font(.system(size: 10))
.foregroundColor(Color(red:0.23137255,green:0.43137255,blue:0.45882353,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,2)
ZStack
{
HStack
{
Text("发布时间: ")
.padding(.leading,0)
.padding(.trailing,5)
.padding(.trailing,5)
.font(.system(size: 10))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
Text("2015-04-19 14:52")
.font(.system(size: 10))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}
HStack
{
Text("评论 (%d)")
.padding(.trailing,5)
.font(.system(size: 10))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
Text("阅读 (%d)")
.font(.system(size: 10))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
}
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(16)
.background(Image("list_cell_background_selector").resizable())}}

struct activity_main_blog_list_item_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_blog_list_item()
    }
}
