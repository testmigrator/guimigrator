import SwiftUI
struct fragment_bar_chart: View {
    
    var body: some View {
        VStack
        {
            Text("Nothing selected")
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
                .padding(5)
                .font(.system(size: 16))
            ZStack()//update
            {
                Rectangle()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
                    .foregroundColor(.gray)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
            .padding(.bottom,12)
            .padding(10)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(10)}}

struct fragment_bar_chart_Previews: PreviewProvider {
    static var previews: some View {
        fragment_bar_chart()
    }
}
