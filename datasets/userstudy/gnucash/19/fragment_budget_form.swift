import SwiftUI
struct fragment_budget_form: View {

var body: some View {
ZStack
{
VStack
{
ScrollView
{
List
{
HStack
{
TextField("Budget name", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.leading,10)
.padding(.trailing,10)
HStack
{
Image("ic_action_sort_by_size")
TextField("Description", text: .constant(""))
.frame(minWidth:0,idealWidth:0)
.background(Color.black)
}
.padding(.leading,10)
.padding(.trailing,10)
Rectangle()
HStack
{
Image("ic_action_rotate_right")
Text("Set budget period")
.frame(minWidth:0,idealWidth:0)
}
.padding(.leading,10)
.padding(.trailing,10)
HStack
{
Text("START")
.frame(minWidth:0,idealWidth:0)
Text("29.11.2015")
.frame(minWidth:0,idealWidth:0)
.padding(3)
.font(.system(size: 16))
.foregroundColor(Color(.gray))
}
.padding(.leading,10)
.padding(.trailing,10)
Rectangle()
{
VStack
{
HStack
{
Text("$")
.font(.system(size: 22))
Rectangle()
.fill(Color.black)
.frame(minWidth:0,idealWidth:0)
Image("ic_close_black_24dp")
.frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
.background(Color.white)
.padding(.top,6)
.padding(.bottom,22)
.padding(.leading,22)
.padding(.trailing,6)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
Rectangle()
HStack
{
Image("ic_action_forward")
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,idealWidth:0)
.listStyle(PlainListStyle())
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(5)
}
.frame(minWidth:0,maxWidth:.infinity)
Button(action: {})
{
Text("Add Budget Amounts")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,10)
}
.frame(minWidth:0,maxWidth:.infinity)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_budget_form_Previews: PreviewProvider {
    static var previews: some View {
        fragment_budget_form()
    }
}
