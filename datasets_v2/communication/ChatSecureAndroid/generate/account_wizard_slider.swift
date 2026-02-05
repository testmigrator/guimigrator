import SwiftUI
struct account_wizard_slider: View {

var body: some View {
ScrollView
{
VStack
{
Text("title text goes here")
.frame(minWidth:0,maxWidth:.infinity)
.padding(8)
.bold()
Text("the detailed body test describing the app will go here and weill apll prima")
.padding(8)
.padding(.top,0)
Button(action: {})
{
Text("Add Account")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.leading,20)
.padding(.trailing,20)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(12)
.background(Color(red:0.8,green:0.8,blue:0.8,opacity:0.8666667))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(12)}}

struct account_wizard_slider_Previews: PreviewProvider {
    static var previews: some View {
        account_wizard_slider()
    }
}
