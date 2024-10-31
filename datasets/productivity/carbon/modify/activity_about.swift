import SwiftUI
struct activity_about: View {
    
    var body: some View {
        ZStack
        {
            VStack
            {
                Text("Version")
                    .bold()
                    .font(.system(size: 20))
                Text("1.5")
                    .bold()
                    .font(.system(size: 18))
            }
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(.top,16)
        .padding(.bottom,16)
        .padding(.leading,16)
        .padding(.trailing,16)
        .background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))}}

struct activity_about_Previews: PreviewProvider {
    static var previews: some View {
        activity_about()
    }
}
