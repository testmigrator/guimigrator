import SwiftUI
struct spinner_item_product_color: View {

var body: some View {
HStack
{
HStack
{
ZStack()
{}
.frame(minWidth:30,idealWidth:30,minHeight:30,idealHeight:30)
.background(Image("rounded_color_drawable").resizable())
.padding(4)
}
.padding(2)
.background(Image("oval_stroke").resizable())
Text("")
.padding(3)
.truncationMode(.tail)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,2)
.padding(.bottom,1)
.padding(.leading,5)
.padding(.trailing,1)
.padding(.leading,5)
.padding(.trailing,1)}}

struct spinner_item_product_color_Previews: PreviewProvider {
    static var previews: some View {
        spinner_item_product_color()
    }
}
