import SwiftUI
struct recyclerview_footer: View {
    
    var body: some View {
        ZStack
        {
            Rectangle()
                .frame(minWidth:40,idealWidth:40,minHeight:40,idealHeight:40)
            VStack
            {
                Text("出问题了")
                    .padding(.top,20)
                    .hidden()
                Button(action: {})
                {
                    Text("重试")
                        .foregroundColor(.black)
                }
                .background(Color.blue)
            }
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:120,idealHeight:120)}}

struct recyclerview_footer_Previews: PreviewProvider {
    static var previews: some View {
        recyclerview_footer()
    }
}
