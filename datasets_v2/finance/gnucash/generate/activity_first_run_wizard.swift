import SwiftUI
struct activity_first_run_wizard: View {

var body: some View {
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
.padding(.top,16)
.padding(.bottom,8)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
HStack
{
Button(action: {})
{
Text("Cancel")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
Button(action: {})
{
Text("Save")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,5)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_first_run_wizard_Previews: PreviewProvider {
    static var previews: some View {
        activity_first_run_wizard()
    }
}
