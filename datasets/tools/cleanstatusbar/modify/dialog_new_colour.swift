import SwiftUI
struct dialog_new_colour: View {

var body: some View {
VStack
{
HStack
{
TextField("Colour name", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(8)
HStack
{
TextField("Colour value (e.g. 33B5E5)", text: .constant(""))
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(8)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_new_colour_Previews: PreviewProvider {
    static var previews: some View {
        dialog_new_colour()
    }
}
