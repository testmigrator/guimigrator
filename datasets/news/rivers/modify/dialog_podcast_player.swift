import SwiftUI
struct dialog_podcast_player: View {
    
    var body: some View {
        VStack
        {
            Text("0")
            HStack
            {
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            HStack
            {
                Button(action: {})
                {
                    Text("Play")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.blue)
                Button(action: {})
                {
                    Text("Stop")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.blue)
            }
            .frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity)}}

struct dialog_podcast_player_Previews: PreviewProvider {
    static var previews: some View {
        dialog_podcast_player()
    }
}
