import SwiftUI
struct signing_in_activity: View {

var body: some View {
VStack
{
HStack
{
Text("Signing inu2026")
}
.padding(.top,20)
HStack
{
    ProgressView().hidden()
}
.padding(.top,5)
ZStack
{
Image("logo_poweredby")
.padding(.leading,20)
.padding(.trailing,20)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct signing_in_activity_Previews: PreviewProvider {
    static var previews: some View {
        signing_in_activity()
    }
}
