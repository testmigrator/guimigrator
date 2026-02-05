import SwiftUI
struct activity_feedback: View {

var body: some View {
VStack
{
HStack
{
Image("ic_back")
.frame(minWidth:25,idealWidth:25,minHeight:25,idealHeight:25)
.accessibility(label: Text("@null"))
Text("Feedback")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 15))
Text("Send")
.frame(minHeight:50,idealHeight:50)
.font(.system(size: 15))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:50,idealHeight:50)
.padding(.leading,5)
.padding(.trailing,15)
Rectangle()
.fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
.frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
VStack
{
TextField("Write down your suggestion", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
TextField("", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:0.90588236,green:0.90588236,blue:0.90588236,opacity:1.0))}}

struct activity_feedback_Previews: PreviewProvider {
    static var previews: some View {
        activity_feedback()
    }
}
