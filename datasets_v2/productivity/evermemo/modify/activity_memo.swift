import SwiftUI
struct activity_memo: View {
    
    var body: some View {
        VStack
        {
            Rectangle()
                .fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
                .frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
            VStack
            {
                ScrollView
                {
                    TextField("", text: .constant(""))
                        .frame(minWidth:0,maxWidth:.infinity)
                        .blendMode(.colorBurn)
                        .padding(.top,12)
                        .padding(.bottom,5)
                        .foregroundColor(Color(red:0.4,green:0.4,blue:0.4,opacity:1.0))
                        .background(Color(red:0.0,green:0.0,blue:0.0,opacity:0.0))
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
            .padding(.leading,15)
            .padding(.trailing,15)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Color(red:0.90588236,green:0.90588236,blue:0.90588236,opacity:1.0))}}

struct activity_memo_Previews: PreviewProvider {
    static var previews: some View {
        activity_memo()
    }
}
