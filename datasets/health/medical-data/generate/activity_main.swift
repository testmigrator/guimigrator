import SwiftUI
struct activity_main: View {

var body: some View {
ZStack
{
VStack
{
Text("INSERT THE PIN")
.padding(.top,40)
.foregroundColor(Color(red:0.33333334,green:0.33333334,blue:0.33333334,opacity:1.0))
TextField("", text: .constant(""))
.padding(.top,30)
}
Button(action: {})
{
Text("START")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(.top,65)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(16)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,30)
.padding(.trailing,30)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
