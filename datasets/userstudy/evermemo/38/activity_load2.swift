import SwiftUI
struct activity_load: View {
    
    var body: some View {
        ZStack
        {
            HStack
            {
                Image("splash_icon")
                    .frame(minWidth:192,idealWidth:192,minHeight:55,idealHeight:55)
//                    .background("splash_icon")//update
                    .padding(.bottom,30)
                    .accessibility(label: Text("@null"))
                
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
       
            VStack
            {
                Spacer()
                Image("splash_wandoujia")
                    .frame(minWidth:137,idealWidth:137,minHeight:30,idealHeight:30)
//                    .background("splash_wandoujia")//update
                    .padding(.bottom,10)
                    .accessibility(label: Text("@null"))
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:80,idealHeight:80)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Color(red:0.90588236,green:0.90588236,blue:0.90588236,opacity:1.0))}}

struct activity_load_Previews: PreviewProvider {
    static var previews: some View {
        activity_load()
    }
}
