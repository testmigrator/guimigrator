import SwiftUI
struct progress: View {

var body: some View {
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct progress_Previews: PreviewProvider {
    static var previews: some View {
        progress()
    }
}
