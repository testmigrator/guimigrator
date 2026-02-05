import SwiftUI
struct activity_playback: View {

var body: some View {
ZStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ZStack
{
Rectangle()
.fill(Color(red:0.0,green:0.0,blue:0.0,opacity:0.53333336))
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
ProgressView()
.padding(36)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))}}

struct activity_playback_Previews: PreviewProvider {
    static var previews: some View {
        activity_playback()
    }
}
