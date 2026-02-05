import SwiftUI
struct item_split_entry: View {
    
    var body: some View {
        VStack
        {
            HStack
            {
                Text("$")
                    .padding(.bottom,10)
                    .padding(.trailing,5)
                    .font(.system(size: 22))
                    .foregroundColor(Color(red:0.75686276,green:0.105882354,blue:0.09019608,opacity:1.0))
                Rectangle()
                    .fill(Color.black)
                    .frame(minWidth:0,idealWidth:0)
                    .padding(.bottom,10)
                Rectangle()
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
            HStack
            {
                TextField("Memo", text: .constant(""))
                    .frame(minWidth:0,maxWidth:.infinity)
                    .font(.system(size: 15))
                    .background(Color.black)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(.leading,7)
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .listStyle(PlainListStyle())
            Text("")
                .frame(minWidth:0,maxWidth:.infinity)
                .hidden()
            Rectangle()
                .fill(Color(red:1.0,green:0.67058825,blue:0.0,opacity:1.0))
                .frame(minWidth:0,maxWidth:.infinity,minHeight:2,idealHeight:2)
                .padding(.top,10)
                .padding(.bottom,10)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct item_split_entry_Previews: PreviewProvider {
    static var previews: some View {
        item_split_entry()
    }
}
