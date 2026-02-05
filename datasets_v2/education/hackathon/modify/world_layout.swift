import SwiftUI
struct world_layout: View {
    
    var body: some View {
        VStack
        {
            Text("This is the World!")
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,10)
                .font(.system(size: 20))
            Image("world_map")
                .resizable()
                .frame(minWidth:445,idealWidth:445,minHeight:0,maxHeight:.infinity)
               
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct world_layout_Previews: PreviewProvider {
    static var previews: some View {
        world_layout()
    }
}
