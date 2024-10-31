import SwiftUI
struct dialog_product_detail_images: View {

var body: some View {
VStack
{
ZStack()
{}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
ZStack
{
Image("ic_media_ff")
.padding(8)
.accessibility(label: Text("Move righ"))
Image("ic_media_rew")
.padding(8)
.accessibility(label: Text("Move left"))
Button(action: {})
{
Text("Close")
.foregroundColor(.black)
}
.background(Color.blue)
.padding(7)
}
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_product_detail_images_Previews: PreviewProvider {
    static var previews: some View {
        dialog_product_detail_images()
    }
}
