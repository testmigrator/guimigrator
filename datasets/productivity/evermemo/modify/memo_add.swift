import SwiftUI
struct memo_add: View {
    
    var body: some View {
        HStack
        {
            ZStack
            {
                Rectangle()
                .frame(minWidth:0,maxWidth:.infinity,minHeight:150,idealHeight:150)
                .padding(20)
                .foregroundColor(Color.gray)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .background(Image("hover_border_normal").resizable())
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(3)}}

struct memo_add_Previews: PreviewProvider {
    static var previews: some View {
        memo_add()
    }
}
