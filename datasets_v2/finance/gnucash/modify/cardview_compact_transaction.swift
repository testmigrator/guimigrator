import SwiftUI
struct cardview_compact_transaction: View {
    
    var body: some View {
        ZStack()//update
        {
            HStack
            {
                ZStack
                {
                    VStack
                    {
                        Text("Primary text")
                            .truncationMode(.tail)
                        Text("Secondary text")
                            .truncationMode(.middle)
                    }
                }
                .frame(minWidth:0,idealWidth:0)
                Text("$450.000.000")
                    .padding(.trailing,10)
                    .font(.system(size: 18))
                    .alignmentGuide(.bottom) { _ in 0 }
                Image("ic_more_vert_black_24dp")
                    .frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
                    .background(Color.white)
                    .padding(.top,20)
                    .padding(.leading,24)
                    .scaledToFit()
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(5)
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .padding(.leading,5)
        .padding(.trailing,5)}}

struct cardview_compact_transaction_Previews: PreviewProvider {
    static var previews: some View {
        cardview_compact_transaction()
    }
}
