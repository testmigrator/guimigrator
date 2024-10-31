import SwiftUI
struct status_bar: View {

var body: some View {
ZStack()
{
Image("")
Image("")
.padding(.trailing)
Image("")
.padding(.trailing,1)
ZStack()
{}
.frame(minWidth:8,idealWidth:8,minHeight:14,idealHeight:14)
.padding(.leading,4)
.padding(.leading,4)
.padding(.top,0)
.padding(.bottom,0)
.padding(.trailing,0)
Text("12:00")
.padding(.leading,6)
.padding(.leading,6)
.foregroundColor(Color(red:0.79607844,green:0.79607844,blue:0.79607844,opacity:0.99607843))
}}}

struct status_bar_Previews: PreviewProvider {
    static var previews: some View {
        status_bar()
    }
}
