import SwiftUI
struct activity_main: View {
    
    var body: some View {
        ZStack
        {
            VStack
            {
                Image("panch")
                    .background(Color.black)
                Button(action: {})
                {
                    Text("Start.nप्रारंभ")
                        .foregroundColor(.black)
                }
                .background(Color.blue)
                .padding(.leading,20)
                .padding(.trailing,20)
            }
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Color(red:0.8039216,green:0.70980394,blue:0.8039216,opacity:0.33333334))}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
