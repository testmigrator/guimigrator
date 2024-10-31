import SwiftUI
struct color_picker_swatch: View {

var body: some View {
Rectangle()
{
Image("")
Image("ic_colorpicker_swatch_selected")
.scaledToFill()
.hidden()
}}}

struct color_picker_swatch_Previews: PreviewProvider {
    static var previews: some View {
        color_picker_swatch()
    }
}
