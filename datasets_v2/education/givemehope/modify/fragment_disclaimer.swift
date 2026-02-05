import SwiftUI
struct fragment_disclaimer: View {
    
    var body: some View {
        VStack
        {
            Text("Disclaimer")
                .frame(minWidth:0,maxWidth:.infinity)
                .bold()
                .font(.system(size: 20))
                .foregroundColor(Color.gray)//update
            ScrollView
            {
                VStack
                {
                    Text("This application was developed by an individual who does not have any affiliation with the content providers Gives Me Hope and affiliates. This application is for educational purposes only.")
                        .frame(minWidth:0,maxWidth:.infinity)
                        .font(.system(size: 14))
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(.top,8)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .padding(24)}}

struct fragment_disclaimer_Previews: PreviewProvider {
    static var previews: some View {
        fragment_disclaimer()
    }
}
