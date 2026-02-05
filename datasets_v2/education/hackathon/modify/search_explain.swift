import SwiftUI
struct search_explain: View {
    
    var body: some View {
        ZStack
        {
            Image("google_search")
                .resizable()
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
                .padding(.bottom,40)
                
            HStack
            {
                Text("")
                    .frame(minWidth:50,idealWidth:50,minHeight:20,idealHeight:20)
                    .padding(.top,60)
                    .padding(.leading,80)
                Text("")
                    .frame(minWidth:20,idealWidth:20,minHeight:20,idealHeight:20)
                    .padding(.top,60)
                    .padding(.leading,120)
            }
            Text("")
                .frame(minWidth:150,idealWidth:150,minHeight:100,idealHeight:100)
                .padding(.bottom,200)
                .padding(.leading,80)
            Button(action: {})
            {
                Text("Continue")
                    .foregroundColor(.black)
            }
            .background(Color.blue)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct search_explain_Previews: PreviewProvider {
    static var previews: some View {
        search_explain()
    }
}
