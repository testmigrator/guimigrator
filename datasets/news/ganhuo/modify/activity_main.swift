import SwiftUI
struct activity_main: View {
    
    var body: some View {
        ZStack
        {
            ZStack
            {
                Text("")
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Color(red:0.972549,green:0.972549,blue:0.94509804,opacity:1.0))}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
