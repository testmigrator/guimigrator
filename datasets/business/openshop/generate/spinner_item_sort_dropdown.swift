import SwiftUI
struct spinner_item_sort_dropdown: View {

var body: some View {
Text("Popular")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,14)
.padding(.bottom,14)
.padding(.leading,10)
.padding(.trailing,25)
.padding(.leading,10)
.padding(.trailing,25)
.foregroundColor(Color(red:0.12941177,green:0.12941177,blue:0.12941177,opacity:1.0))
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct spinner_item_sort_dropdown_Previews: PreviewProvider {
    static var previews: some View {
        spinner_item_sort_dropdown()
    }
}
