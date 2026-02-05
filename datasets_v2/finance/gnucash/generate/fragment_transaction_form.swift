import SwiftUI
struct fragment_transaction_form: View {
@State private  var checkbox_save_template  = false
var body: some View {
ZStack
{
ScrollView
{
List
{
HStack
{
Text("")
{
Rectangle()
}
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 22))
.background(Color.black)
}
Rectangle()
.padding(.leading,0)
HStack
{
Text("$")
.font(.system(size: 22))
.foregroundColor(Color(red:0.75686276,green:0.105882354,blue:0.09019608,opacity:1.0))
Rectangle()
.fill(Color.black)
.frame(minWidth:0,idealWidth:0)
Image("content_split_holo_light")
.accessibility(label: Text("Open split editor"))
Rectangle()
.frame(minWidth:0,idealWidth:0)
}
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
Rectangle()
HStack
{
Image("ic_action_time")
Text("")
.frame(minWidth:0,idealWidth:0)
Text("")
.frame(minWidth:0,idealWidth:0)
}
Rectangle()
HStack
{
Image("ic_action_sort_by_size")
TextField("Add note", text: .constant(""))
.frame(minWidth:0,idealWidth:0)
.background(Color.black)
}
Rectangle()
HStack
{
Image("ic_action_rotate_right")
Text("Tap to create schedule")
.frame(minWidth:0,idealWidth:0)
}
Button(action: { self.checkbox_save_template.toggle() })
{
HStack
{
Image(systemName: checkbox_save_template ? "checkmark.square" : "square")
.padding(.bottom,10)
Text("Save as template")
.foregroundColor(.black)
.padding(.bottom,10)
}
.padding(.bottom,10)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color.blue)
.padding(.bottom,10)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_transaction_form_Previews: PreviewProvider {
    static var previews: some View {
        fragment_transaction_form()
    }
}
