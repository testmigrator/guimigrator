import SwiftUI
struct activity_transactions: View {
    
    var body: some View {
        NavigationView
        {
            HStack
            {
                NavigationView
                {
                    ZStack
                    {
                        ProgressView()
                            .frame(minWidth:0,maxWidth:.infinity,minHeight:5,idealHeight:5)
                        ZStack()
                        {
                            List
                            {
                                ForEach(1..<10)
                                {
                                    index in
                                    Text("Item \(index)")
                                }
                            }
                            .listStyle(PlainListStyle())
                        }
//                        .fill(Color.white)
                        .frame(minWidth:0,maxWidth:.infinity)
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    HStack
                    {
                        Text("")
                    }
                    .frame(minWidth:0,maxWidth:.infinity)
                    .background(Color.white)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity)
                HStack
                {
                    Text("Balance:")
                        .frame(minWidth:0,idealWidth:0)
                        .padding(.leading,12)
                    Text("")
                        .padding(.trailing,12)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Image("abc_ab_share_pack_mtrl_alpha").resizable())
                Rectangle()
                    .padding(20)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            Rectangle()
                .frame(minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct activity_transactions_Previews: PreviewProvider {
    static var previews: some View {
        activity_transactions()
    }
}
