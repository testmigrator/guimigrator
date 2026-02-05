import SwiftUI
struct view_toolbar: View {

var body: some View {
Rectangle()
.fill(Color(red:0.12941177,green:0.5882353,blue:0.9529412,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity)}}

struct view_toolbar_Previews: PreviewProvider {
    static var previews: some View {
        view_toolbar()
    }
}
