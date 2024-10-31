import SwiftUI
struct spinner_item_product_size: View {

var body: some View {
Text("")
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,12)
.padding(.bottom,12)
.padding(.leading,5)
.padding(.trailing,1)
.padding(.leading,5)
.padding(.trailing,1)
.truncationMode(.tail)}}

struct spinner_item_product_size_Previews: PreviewProvider {
    static var previews: some View {
        spinner_item_product_size()
    }
}
