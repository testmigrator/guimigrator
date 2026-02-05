import SwiftUI
struct dialog_rate: View {

var body: some View {
VStack
{
Text("为AnimeTaste给个五星吧！")
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(20)}}

struct dialog_rate_Previews: PreviewProvider {
    static var previews: some View {
        dialog_rate()
    }
}
