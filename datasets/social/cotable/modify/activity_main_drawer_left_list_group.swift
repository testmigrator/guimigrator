import SwiftUI
struct activity_main_drawer_left_list_group: View {

    var body: some View {
        ZStack
        {
            Text("Blog")
                .font(.system(size: 14))
            Rectangle().hidden()
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:48,idealHeight:48)
        .padding(.leading,16)
        .padding(.trailing,16)
        .padding(.leading,16)
        .padding(.trailing,16)
    }}

struct activity_main_drawer_left_list_group_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_drawer_left_list_group()
    }
}
