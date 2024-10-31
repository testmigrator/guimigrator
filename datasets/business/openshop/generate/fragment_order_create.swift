import SwiftUI
struct fragment_order_create: View {

var body: some View {
VStack
{
ScrollView
{
VStack
{
VStack
{
Text("Summary")
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
VStack
{
Text("")
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
Text("15212 USD")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,4)
.bold()
.font(.system(size: 16))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
ZStack()
{}
.frame(minHeight:16,idealHeight:16)
.background(Color(red:0.9490196,green:0.9490196,blue:0.9490196,opacity:1.0))
.padding(.top,16)
.padding(.bottom,16)
ZStack
{
VStack
{
VStack
{
Text("Shipping method")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
HStack
{
Text("Choose shipping method")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.truncationMode(.tail)
Text("free")
.bold()
.font(.system(size: 13))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Image("spinner_background_black_baseline").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)
.opacity(0.0)
.background(Color.white)
VStack
{
Text("Payment")
.padding(.top,16)
.bold()
.font(.system(size: 15))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
HStack
{
Text("Choose payment method")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.truncationMode(.tail)
Text("free")
.bold()
.font(.system(size: 13))
.foregroundColor(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Image("spinner_background_black_baseline").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)
.opacity(0.0)
.background(Color.white)
}
ProgressView()
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
ZStack()
{}
.frame(minHeight:16,idealHeight:16)
.background(Color(red:0.9490196,green:0.9490196,blue:0.9490196,opacity:1.0))
.padding(.top,16)
.padding(.bottom,16)
VStack
{
Text("Shipping details")
.bold()
.font(.system(size: 14))
.foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
HStack
{
TextField("Name:", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,8)
HStack
{
HStack
{
TextField("Street", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
HStack
{
TextField("House code", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
HStack
{
TextField("City", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
HStack
{
TextField("ZIP", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,idealWidth:0)
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
TextField("Email", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,8)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
TextField("Phone", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
HStack
{
TextField("Note", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,12)
.font(.system(size: 18))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
ZStack()
{}
.frame(minHeight:16,idealHeight:16)
.background(Color(red:0.9490196,green:0.9490196,blue:0.9490196,opacity:1.0))
.padding(.top,8)
.padding(.bottom,8)
VStack
{
HStack
{
Text("Click on Order to allow our <b><font color=#ee1f65>Terms and Conditions</b>")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 10))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
VStack
{
Text("9995 USD")
.font(.system(size: 14))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("inc. VAT")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 13))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.padding(.leading,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
Button(action: {})
{
Text("Finish order")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,16)
.padding(.trailing,16)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
.padding(.bottom,16)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_order_create_Previews: PreviewProvider {
    static var previews: some View {
        fragment_order_create()
    }
}
