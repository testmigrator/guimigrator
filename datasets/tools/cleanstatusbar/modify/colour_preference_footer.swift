import SwiftUI
struct colour_preference_footer: View {

var body: some View {
Text("Add new colour")
.frame(minWidth:0,maxWidth:.infinity)
.overlay(Image("ic_content_new").padding(.trailing,200)
.padding(10))
.padding(.leading)
.padding(.trailing)
.padding(.leading)
.padding(.trailing)}}

struct colour_preference_footer_Previews: PreviewProvider {
    static var previews: some View {
        colour_preference_footer()
    }
}
