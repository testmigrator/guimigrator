import SwiftUI
struct activity_login: View {
    
    var body: some View {
        VStack
        {
            Image("logo_cropped")
                .resizable()
                .frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
                .padding(.top,32)
                .accessibility(label: Text("HTTP Sms Logo"))
            VStack
            {
                Text("Open\nhttpsms.com/settings\nto get your API key")
                    .padding(.bottom,20)
                    .font(.system(size: 20))
               
            }
            VStack
            {
                HStack
                {
                    Rectangle()
                        .frame(minWidth:0,maxWidth:.infinity)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .hidden()
            }
            .frame(minWidth:0,maxWidth:.infinity)
            VStack
            {
                Rectangle()
                    .padding(10)
                Rectangle()
                    .padding(.top,4)
            }      .hidden()
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
  
        .padding(.leading,16)
        .padding(.trailing,16)}}

struct activity_login_Previews: PreviewProvider {
    static var previews: some View {
        activity_login()
    }
}
