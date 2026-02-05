import SwiftUI
struct fragment_text_report: View {

var body: some View {
VStack
{
Text("Assets")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:0.67058825,blue:0.0,opacity:1.0))
Rectangle()
{
List
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
Text("Liabilities")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:0.67058825,blue:0.0,opacity:1.0))
Rectangle()
{
List
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
Text("Equity")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 18))
.foregroundColor(Color(red:1.0,green:0.67058825,blue:0.0,opacity:1.0))
Rectangle()
{
List
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
Rectangle()
{
List
{
HStack
{
Text("Net Worth")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 18))
Text("$ 2,500")
.frame(minWidth:0,idealWidth:0)
.bold()
.font(.system(size: 18))
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(10)}}

struct fragment_text_report_Previews: PreviewProvider {
    static var previews: some View {
        fragment_text_report()
    }
}
