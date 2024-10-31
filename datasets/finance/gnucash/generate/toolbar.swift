import SwiftUI
struct toolbar: View {

var body: some View {
ZStack
{
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)}}

struct toolbar_Previews: PreviewProvider {
    static var previews: some View {
        toolbar()
    }
}
