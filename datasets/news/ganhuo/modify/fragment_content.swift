import SwiftUI
struct fragment_content: View {
    
    var body: some View {
        ZStack
        {
            HStack
            {
                List
                {
                    ForEach(1..<10)
                    {
                        index in
                        Text("Item \(index)")
                    }
                }
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
                .listStyle(PlainListStyle())
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            ZStack
            {
                Rectangle()
                VStack
                {
                    Text("     网络出问题啦\n检查下你的网络连接")
                        .padding(.bottom,20)
                        .hidden()
                    Button(action: {})
                    {
                        Text("重试")
                            .foregroundColor(.black)
                    }
                    .background(Color.blue)
                }
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .padding(.bottom,100)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_content_Previews: PreviewProvider {
    static var previews: some View {
        fragment_content()
    }
}
