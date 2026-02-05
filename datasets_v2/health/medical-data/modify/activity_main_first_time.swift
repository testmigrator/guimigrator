import SwiftUI
struct activity_main_first_time: View {
    
    var body: some View {
        ScrollView
        {
            ZStack
            {
                VStack
                {
                    VStack
                    {
                        Text("EMAIL")
                            .padding(.top,40)
                        TextField("", text: .constant(""))
                    }
                    Text("PIN (6 digits)")
                        .padding(.top,30)
                    Button(action: {})
                    {
                        Text("SIGN IN")
                            .foregroundColor(.black)
                    }
                    .background(Color.white)
                    .padding(.top,65)
                    .padding(.bottom,30)
                    Text("Sign up")
                        .foregroundColor(Color(red:0.9137255,green:0.11764706,blue:0.3882353,opacity:1.0))
                }
                .padding(.top,16)
                .padding(.bottom,16)
                .padding(.leading,16)
                .padding(.trailing,16)
            }
        }}}

struct activity_main_first_time_Previews: PreviewProvider {
    static var previews: some View {
        activity_main_first_time()
    }
}
