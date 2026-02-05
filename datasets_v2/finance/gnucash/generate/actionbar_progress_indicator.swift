import SwiftUI
struct actionbar_progress_indicator: View {

var body: some View {
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)}}

struct actionbar_progress_indicator_Previews: PreviewProvider {
    static var previews: some View {
        actionbar_progress_indicator()
    }
}
