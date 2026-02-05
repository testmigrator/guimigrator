import SwiftUI
struct widget_configuration: View {
@State private  var input_hide_account_balance  = false
var body: some View {
VStack
{
Text("Book")
.padding(.top,8)
.padding(.bottom)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity)
.listStyle(PlainListStyle())
.padding(.bottom,10)
Text("Display account")
.padding(.top,8)
.padding(.bottom)
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity)
.listStyle(PlainListStyle())
Button(action: { self.input_hide_account_balance.toggle() })
{
HStack
{
Image(systemName: input_hide_account_balance ? "checkmark.square" : "square")
.padding(.top,8)
Text("Hide account balance in widget")
.foregroundColor(.black)
.padding(.top,8)
}
.padding(.top,8)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.top,8)
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

struct widget_configuration_Previews: PreviewProvider {
    static var previews: some View {
        widget_configuration()
    }
}
