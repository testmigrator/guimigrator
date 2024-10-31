import SwiftUI
struct fragment_license: View {

var body: some View {
ZStack
{
VStack
{
Text("Open source libraries")
.padding(8)
.font(.system(size: 17))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
//update
//.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
ProgressView()
        .hidden()
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(8)}}

struct fragment_license_Previews: PreviewProvider {
    static var previews: some View {
        fragment_license()
    }
}
