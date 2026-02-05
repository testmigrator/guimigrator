import SwiftUI
struct audio_player_activity: View {

var body: some View {
VStack
{
Text("Filename Here")
.padding(.top,20)
.lineLimit(3)
Button(action: {})
{
Text("Play")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.top,5)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct audio_player_activity_Previews: PreviewProvider {
    static var previews: some View {
        audio_player_activity()
    }
}
