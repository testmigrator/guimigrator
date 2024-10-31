import SwiftUI
struct payment_dialog: View {

var body: some View {
VStack
{
HStack
{
Image("back_arrow")
.background(Color.white)
.accessibility(label: Text("Back arrow"))
Text("Payment")
.frame(minWidth:0,maxWidth:.infinity)
.bold()
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:0.93333334,green:0.12156863,blue:0.39607844,opacity:1.0))
List
{
ForEach(1..<10)
{
index in
Text("Item \(index)")
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
.listStyle(PlainListStyle())
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct payment_dialog_Previews: PreviewProvider {
    static var previews: some View {
        payment_dialog()
    }
}
