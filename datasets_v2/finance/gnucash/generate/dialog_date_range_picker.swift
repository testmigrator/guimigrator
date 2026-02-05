import SwiftUI
struct dialog_date_range_picker: View {

var body: some View {
VStack
{
Rectangle()
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
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
.frame(minWidth:0,maxWidth:.infinity)}}

struct dialog_date_range_picker_Previews: PreviewProvider {
    static var previews: some View {
        dialog_date_range_picker()
    }
}
