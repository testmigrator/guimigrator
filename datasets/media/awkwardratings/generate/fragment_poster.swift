import SwiftUI
struct fragment_poster: View {

var body: some View {
ZStack
{
Image("")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ProgressView()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))}}

struct fragment_poster_Previews: PreviewProvider {
    static var previews: some View {
        fragment_poster()
    }
}
