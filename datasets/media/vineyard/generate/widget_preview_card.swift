import SwiftUI
struct widget_preview_card: View {

var body: some View {
ZStack
{
Rectangle()
.frame(minWidth:175,idealWidth:175,minHeight:175,idealHeight:175)
Image("")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.accessibility(label: Text("@null"))
Rectangle()
.fill(Color(red:0.0,green:0.0,blue:0.0,opacity:0.46666667))
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ProgressView()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct widget_preview_card_Previews: PreviewProvider {
    static var previews: some View {
        widget_preview_card()
    }
}
