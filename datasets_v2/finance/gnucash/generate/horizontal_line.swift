import SwiftUI
struct horizontal_line: View {

var body: some View {
Rectangle()
.fill(Color(red:0.6666667,green:0.6666667,blue:0.6666667,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
.padding(.top,10)
.padding(.bottom,10)}}

struct horizontal_line_Previews: PreviewProvider {
    static var previews: some View {
        horizontal_line()
    }
}
