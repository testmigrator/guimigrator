import SwiftUI
struct colour_preference_row: View {

var body: some View {
HStack
{
Text("")
.frame(minWidth:0,idealWidth:0)
Image("")
.frame(minWidth:40,idealWidth:40,minHeight:40,idealHeight:40)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct colour_preference_row_Previews: PreviewProvider {
    static var previews: some View {
        colour_preference_row()
    }
}
