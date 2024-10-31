import SwiftUI
struct dim_container: View {

var body: some View {
ZStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.hidden()}}

struct dim_container_Previews: PreviewProvider {
    static var previews: some View {
        dim_container()
    }
}
