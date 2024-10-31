import SwiftUI
struct aactivity_main: View {
    
    var body: some View {
        VStack
        {
            Rectangle()
                .fill(Color.white)
                .frame(minWidth:0,maxWidth:.infinity)
            HStack
            {
                Text("")
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .background(Color.white)
            ZStack{}
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct aactivity_main_Previews: PreviewProvider {
    static var previews: some View {
        aactivity_main()
    }
}
