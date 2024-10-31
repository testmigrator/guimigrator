import SwiftUI
struct dialog_order_create_success: View {

var body: some View {
VStack
{
Text("Thank you for your order")
.padding(.top,5)
.padding(10)
.font(.system(size: 20))
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
Text("Wait for <b>SMS</b> or <b>email</b> order confirmation.")
.padding(.top,7)
.padding(14)
.font(.system(size: 16))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
Button(action: {})
{
Text("@android:string/ok")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.top,15)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct dialog_order_create_success_Previews: PreviewProvider {
    static var previews: some View {
        dialog_order_create_success()
    }
}
