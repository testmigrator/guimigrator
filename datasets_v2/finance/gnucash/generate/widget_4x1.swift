import SwiftUI
struct widget_4x1: View {

var body: some View {
ZStack
{
HStack
{
Text("Account name")
.frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
.padding(.leading,12)
.foregroundColor(Color(.gray))
.truncationMode(.tail)
Text("")
.frame(minHeight:0,maxHeight:.infinity)
.padding(.leading,8)
.padding(.trailing,8)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:48,idealWidth:48)
.background(Color.blue)
.padding(.leading,12)
.padding(.trailing,12)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:48,idealWidth:48)
.background(Color.blue)
.padding(.leading,12)
.padding(.trailing,12)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Image("appwidget_dark_bg_clickable").resizable())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(8)}}

struct widget_4x1_Previews: PreviewProvider {
    static var previews: some View {
        widget_4x1()
    }
}
