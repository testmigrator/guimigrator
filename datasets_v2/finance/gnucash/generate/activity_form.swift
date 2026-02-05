import SwiftUI
struct activity_form: View {

var body: some View {
VStack
{
ZStack
{
ProgressView()
.frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
ZStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_form_Previews: PreviewProvider {
    static var previews: some View {
        activity_form()
    }
}
