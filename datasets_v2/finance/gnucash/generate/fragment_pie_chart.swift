import SwiftUI
struct fragment_pie_chart: View {

var body: some View {
VStack
{
Text("Selected chart slice")
.frame(minWidth:0,maxWidth:.infinity)
.padding(5)
.font(.system(size: 16))
Rectangle()
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.padding(.bottom,12)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(10)}}

struct fragment_pie_chart_Previews: PreviewProvider {
    static var previews: some View {
        fragment_pie_chart()
    }
}
