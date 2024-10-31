import SwiftUI
struct list_cell_footer: View {

var body: some View {
ZStack
{
HStack
{
ProgressView()
.frame(minWidth:23,idealWidth:23,minHeight:23,idealHeight:23)
Text("加载中...")
.padding(.leading,10)
.font(.system(size: 16))
.foregroundColor(Color(red:0.6039216,green:0.6039216,blue:0.6039216,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct list_cell_footer_Previews: PreviewProvider {
    static var previews: some View {
        list_cell_footer()
    }
}
