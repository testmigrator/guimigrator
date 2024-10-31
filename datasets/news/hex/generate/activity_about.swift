import SwiftUI
struct activity_about: View {

var body: some View {
VStack
{
NavigationView
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
VStack
{
Text("About")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.font(.system(size: 20))
Text("Hex is built to be fun, fast and pleasurable to use.nnHex is open source and available on GitHub. Hex is powered by Hex API.")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,16)
Text("Feedback")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.font(.system(size: 20))
Text("If you come across any issues or have any feature requests they are most welcome here.")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,16)
Text("Contributing")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.font(.system(size: 20))
Text("Contributions are always welcome. For more information please see the Contribution Guidelines.")
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_about_Previews: PreviewProvider {
    static var previews: some View {
        activity_about()
    }
}
