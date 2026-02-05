import SwiftUI
struct failed_item: View {
    
    var body: some View {
        VStack
        {
            Image("failed_loading")
                .foregroundColor(Color(red:0.64705884,green:0.6313726,blue:0.6745098,opacity:1.0))
            Text("Failed to load")
                .foregroundColor(Color(red:0.30588236,green:0.2901961,blue:0.34117648,opacity:1.0))
            Button(action: {})
            {
                Text("Retry")
                    .foregroundColor(.black)
            }
            .background(Color.gray)
            .padding(.top,16)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct failed_item_Previews: PreviewProvider {
    static var previews: some View {
        failed_item().background(.gray.opacity(0.3))
    }
}
