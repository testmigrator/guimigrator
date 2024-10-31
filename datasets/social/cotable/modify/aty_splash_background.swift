import SwiftUI
struct aty_splash_background: View {

var body: some View {
ZStack
{
Image("bg_splash_bg")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.scaledToFill()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct aty_splash_background_Previews: PreviewProvider {
    static var previews: some View {
        aty_splash_background()
    }
}
