import SwiftUI
struct contact_grid_filter_view: View {

var body: some View {
Rectangle()
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(0)
Text("No contacts found.nnTap to invite.")
.font(.system(size: 24))
}
.fill(Color(red:0.0,green:0.0,blue:0.0,opacity:0.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(0)}}

struct contact_grid_filter_view_Previews: PreviewProvider {
    static var previews: some View {
        contact_grid_filter_view()
    }
}
