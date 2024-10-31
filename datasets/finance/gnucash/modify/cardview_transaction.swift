import SwiftUI
struct cardview_transaction: View {
    
    var body: some View {
        ZStack()//update
        {
            ZStack
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
                VStack
                {
                    HStack
                    {
                        Spacer()
                        Image("ic_more_vert_black_24dp")
                            .frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
                            .background(Color.white)
                            .padding(.bottom,4)
                            .padding(.top,20)
                            .padding(.leading,24)
                            .scaledToFit()
                    }
                    Text("$ 45")
                        .padding(.trailing,10)
                        .font(.system(size: 18))
                }
                Image("ic_mode_edit_black_24dp")
                    .frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
                    .background(Color.white)
                    .padding(.top,6)
                    .padding(.bottom,22)
                    .padding(.leading,22)
                    .padding(.trailing,6)
                Text("Sat, 04 July")
                    .padding(.bottom,4)
                    .font(.system(size: 14))
                    .foregroundColor(Color(.gray))
            }
            .frame(minWidth:0,maxWidth:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity)
        .padding(.leading,5)
        .padding(.trailing,5)}}

struct cardview_transaction_Previews: PreviewProvider {
    static var previews: some View {
        cardview_transaction()
    }
}
