import SwiftUI
struct account_activity: View {
    @State private  var rememberPassword  = false
    @State private  var useTor  = false
    var body: some View {
        ScrollView
        {
            VStack
            {
                TextField("user@domain", text: .constant(""))
                    .frame(minWidth:0,maxWidth:.infinity)
                ZStack(){}
                    .frame(minWidth:0,maxWidth:.infinity)
                TextField("password", text: .constant(""))
                    .frame(minWidth:0,maxWidth:.infinity)
                TextField("confirm password", text: .constant(""))
                    .frame(minWidth:0,maxWidth:.infinity)
                Button(action: {})
                {
                    Text("Sign in")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.green)
                .padding(.top,3)
                VStack
                {
                    Text("")
                }
                .frame(minWidth:0,maxWidth:.infinity,minHeight:20,idealHeight:20)
                Button(action: { self.rememberPassword.toggle() })
                {
                    HStack
                    {
                        Image(systemName: rememberPassword ? "checkmark.square" : "square")
                            .padding(.top,3)
                            .padding(.bottom,3)
                        Text("Remember my password.")
                            .foregroundColor(.black)
                            .padding(.top,3)
                            .padding(.bottom,3)
                    }
                    .padding(.top,3)
                    .padding(.bottom,3)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.white)
                .padding(.top,3)
                .padding(.bottom,3)
                Button(action: { self.useTor.toggle() })
                {
                    HStack
                    {
                        Image(systemName: useTor ? "checkmark.square" : "square")
                            .padding(.top,3)
                            .padding(.bottom,3)
                        Text("Connect via Tor (Requires Orbot app)")
                            .foregroundColor(.black)
                            .padding(.top,3)
                            .padding(.bottom,3)
                    }
                    .padding(.top,3)
                    .padding(.bottom,3)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.white)
                .padding(.top,3)
                .padding(.bottom,3)
                Button(action: {})
                {
                    Text("Advanced Account Settings")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.white)
                .padding(.top,20)
                Button(action: {})
                {
                    Text("Display Your Fingerprint")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.white)
                .padding(.top,3)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .padding(10)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct account_activity_Previews: PreviewProvider {
    static var previews: some View {
        account_activity()
    }
}
