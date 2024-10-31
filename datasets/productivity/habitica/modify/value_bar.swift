import SwiftUI
struct value_bar: View {
    
    var body: some View {
        ZStack
        {
            Image("")
                .padding(.trailing,8)
                .accessibility(label: Text("@null"))
                .hidden()
            HStack{}//update
                .frame(minWidth:0,maxWidth:.infinity,minHeight:8,idealHeight:8)
            HStack
            {
                Image("")
                    .frame(minWidth:18,idealWidth:18,minHeight:18,idealHeight:18)
                    .padding(.trailing,4)
                    .hidden()
                Text("50/50")
                    .frame(minWidth:0,idealWidth:0)
                    .font(.system(size: 14))
                Spacer()
                Image("")
                    .frame(minWidth:18,idealWidth:18,minHeight:18,idealHeight:18)
                    .padding(.trailing,4)
                    .hidden()
                Text("Health")
                    .font(.system(size: 14))
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(.top,2)
        }
        .frame(minWidth:0,maxWidth:.infinity)}}

struct value_bar_Previews: PreviewProvider {
    static var previews: some View {
        value_bar()
    }
}
