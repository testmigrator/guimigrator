import SwiftUI
struct activity_story: View {

var body: some View {
VStack
{
NavigationView
{
Rectangle()
.fill(Color.white)
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.white)
}
.frame(minWidth:0,maxWidth:.infinity)
    ZStack{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
VStack
{
Image("cloud_off")
.frame(minWidth:80,idealWidth:80,minHeight:80,idealHeight:80)

.padding(.top)
.padding(.bottom,15)
.accessibility(label: Text("@null"))
Text("Unable to load content")
.padding(.bottom,20)
.font(.system(size: 20))
Button(action: {})
{
Text("Try Again")
.foregroundColor(.black)
}
.background(Color.blue)
}
.padding(16)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_story_Previews: PreviewProvider {
    static var previews: some View {
        activity_story()
    }
}
