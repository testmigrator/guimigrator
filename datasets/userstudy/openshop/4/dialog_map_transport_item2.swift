import SwiftUI
struct dialog_map_transport_item: View {

var body: some View {
HStack
{
Image("ic_notification_big")
.padding(.trailing,5)
.padding(.trailing,5)
Text("Shop is 4000 km from nearest train station. Take a taxi to get there.")
.frame(minWidth:0,idealWidth:0)
.font(.system(size: 13))
.foregroundColor(Color(red:0.44705883,green:0.44705883,blue:0.44705883,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.bottom,4)}}

struct dialog_map_transport_item_Previews: PreviewProvider {
    static var previews: some View {
        dialog_map_transport_item()
    }
}
