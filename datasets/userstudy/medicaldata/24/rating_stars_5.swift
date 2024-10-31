import SwiftUI
struct rating_stars_5: View {

var body: some View {
HStack
{
Text("1")
.font(.system(size: 18))
.background(Image("star").resizable())
Text("2")
.padding(.leading,7)
.font(.system(size: 18))
.background(Image("star").resizable())
Text("3")
.padding(.leading,7)
.font(.system(size: 18))
.background(Image("star").resizable())
Text("4")
.padding(.leading,7)
.font(.system(size: 18))
.background(Image("star").resizable())
Text("5")
.padding(.leading,7)
.font(.system(size: 18))
.background(Image("star").resizable())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct rating_stars_5_Previews: PreviewProvider {
    static var previews: some View {
        rating_stars_5()
    }
}
