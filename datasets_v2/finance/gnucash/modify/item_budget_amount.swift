import SwiftUI
struct item_budget_amount: View {
    
    var body: some View {
        ZStack()
        {
            VStack
            {
                HStack
                {
                    Text("$")
                        .font(.system(size: 22))
                    Rectangle()
                        .fill(Color.black)
                        .frame(minWidth:0,idealWidth:0)
                    Image("ic_close_black_24dp")
                        .frame(minWidth:48,idealWidth:48,minHeight:48,idealHeight:48)
                        .background(Color.white)
                        .padding(.top,6)
                        .padding(.bottom,22)
                        .padding(.leading,22)
                        .padding(.trailing,6)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(10)
                Rectangle()
                HStack
                {
                    Image("ic_action_forward")
                    List
                    {
                        ForEach(1..<10)
                        {
                            index in
                            Text("Item \(index)")
                        }
                    }
                    .frame(minWidth:0,idealWidth:0)
                    .listStyle(PlainListStyle())
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(10)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(5)
        }
        .frame(minWidth:0,maxWidth:.infinity)}}

struct item_budget_amount_Previews: PreviewProvider {
    static var previews: some View {
        item_budget_amount()
    }
}
