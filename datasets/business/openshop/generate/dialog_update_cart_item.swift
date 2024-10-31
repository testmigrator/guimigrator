import SwiftUI
struct dialog_update_cart_item: View {

var body: some View {
ZStack
{
VStack
{
VStack
{
HStack
{
Text("Update:")
.padding(.top,10)
.padding(.bottom,10)
.font(.system(size: 19))
Text("")
.frame(minWidth:0,idealWidth:0)
.padding(.leading,10)
.padding(.top,10)
.padding(.bottom,10)
.font(.system(size: 16))
}
.frame(minWidth:0,maxWidth:.infinity)
ProgressView()
.padding(.top,75)
}
VStack
{
VStack
{
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.top,4)
.padding(.bottom,4)
.background(Image("spinner_background_black_baseline").resizable())
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.top,4)
.padding(.top,4)
.padding(.bottom,4)
.background(Image("spinner_background_black_baseline").resizable())
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.listStyle(PlainListStyle())
.padding(.top,4)
.padding(.top,4)
.padding(.bottom,4)
.background(Image("spinner_background_black_baseline").resizable())
}
.frame(minWidth:0,maxWidth:.infinity)
.opacity(1.0)
HStack
{
Button(action: {})
{
Text("Cancel")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.top,14)
.padding(.bottom,14)
Button(action: {})
{
Text("Save")
.foregroundColor(.black)
}
.frame(minWidth:0,idealWidth:0)
.background(Color.blue)
.padding(.leading,15)
.padding(.top,14)
.padding(.bottom,14)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,15)
}
.frame(minWidth:0,maxWidth:.infinity)
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(10)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct dialog_update_cart_item_Previews: PreviewProvider {
    static var previews: some View {
        dialog_update_cart_item()
    }
}
