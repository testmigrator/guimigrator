import SwiftUI
struct dialog_discount_fragment: View {

var body: some View {
ZStack
{
VStack
{
VStack
{
HStack
{
Text("Enter the discount code")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 18))
Image("close_black")
.background(Color.white)
.padding(5)
.accessibility(label: Text("Cancel"))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
TextField("Discount code", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.font(.system(size: 16))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
Button(action: {})
{
Text("OK")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(16)
VStack
{
ProgressView()
.padding(8)
}
.frame(minWidth:0,maxWidth:.infinity)
.hidden()
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.7019608))
}
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct dialog_discount_fragment_Previews: PreviewProvider {
    static var previews: some View {
        dialog_discount_fragment()
    }
}
