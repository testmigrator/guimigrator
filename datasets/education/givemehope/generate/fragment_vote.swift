import SwiftUI
struct fragment_vote: View {

var body: some View {
ZStack
{
HStack
{
ScrollView
{
VStack
{
Rectangle()
.frame(minHeight:0,idealHeight:0)
Rectangle()
{
VStack
{
Image("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,4)
.padding(.leading,4)
.padding(.trailing,4)
Text("@+id/voteFooterTextView")
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
.italic()
.font(.system(size: 12))
.foregroundColor(Color())
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
Rectangle()
.frame(minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.leading,8)
.padding(.trailing,8)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.padding(16)
Rectangle()
.padding(16)
ProgressView()
Image("ic_error_white_48dp")
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_vote_Previews: PreviewProvider {
    static var previews: some View {
        fragment_vote()
    }
}
