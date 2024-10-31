import SwiftUI
struct panel_loading: View {

var body: some View {
Text("Loading …")
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.font(.system(size: 26))
.foregroundColor(Color(red:0.7647059,green:0.70980394,blue:0.654902,opacity:1.0))
.background(Color(red:1.0,green:0.92941177,blue:0.85882354,opacity:1.0))}}

struct panel_loading_Previews: PreviewProvider {
    static var previews: some View {
        panel_loading()
    }
}
