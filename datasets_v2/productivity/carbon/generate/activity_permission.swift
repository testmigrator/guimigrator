import SwiftUI
struct activity_permission: View {

var body: some View {
ZStack
{
Button(action: {})
{
Text("Proceed")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.top,46)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)
.background(Image("perm").resizable())}}

struct activity_permission_Previews: PreviewProvider {
    static var previews: some View {
        activity_permission()
    }
}
