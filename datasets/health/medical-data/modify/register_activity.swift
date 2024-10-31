import SwiftUI
struct register_activity: View {
    @State private  var gender_answer  : String?
    @State private  var terms_check  = false
    @State private  var terms_check2  = false
    var body: some View {
        ScrollView
        {
            ZStack
            {
                ZStack
                {
                    VStack
                    {
                        Text("NAME")
                            .padding(.top,20)
                        TextField("", text: .constant(""))
                    }
                    Text("EMAIL")
                        .padding(.top,30)
                    Text("BIRTH DATE")
                        .padding(.top,30)
                    Rectangle()
                    Text("GENDER")
                        .padding(.top,30)
                    HStack
                    {
                        Button(action: { gender_answer = "MALE" })
                        {
                            HStack
                            {
                                Image(systemName: gender_answer == "MALE" ? "checkmark.circle.fill" : "circle")
                                Text("MALE")
                                    .foregroundColor(.black)
                            }
                        }
                        Button(action: { gender_answer = "FEMALE" })
                        {
                            HStack
                            {
                                Image(systemName: gender_answer == "FEMALE" ? "checkmark.circle.fill" : "circle")
                                    .padding(.leading,50)
                                    .padding(.leading,50)
                                Text("FEMALE")
                                    .foregroundColor(.black)
                                    .padding(.leading,50)
                                    .padding(.leading,50)
                            }
                            .padding(.leading,50)
                            .padding(.leading,50)
                        }
                        .padding(.leading,50)
                        .padding(.leading,50)
                    }
                    Text("PIN (6 digits)")
                        .padding(.top,23)
                    Text("REPEAT THE PIN")
                        .padding(.top,30)
                    ZStack
                    {
                        HStack
                        {
                            Button(action: { self.terms_check.toggle() })
                            {
                                HStack
                                {
                                    Image(systemName: terms_check ? "checkmark.square" : "square")
                                    Text("")
                                        .foregroundColor(.black)
                                }
                            }
                            .background(Color.blue)
                            Text("")
                                .padding(.leading,5)
                        }
                    }
                    .padding(.top,31)
                    Button(action: {})
                    {
                        Text("REGISTER")
                            .foregroundColor(.black)
                    }
                    .background(Color.blue)
                    .padding(.top,40)
                    .padding(.bottom,40)
                }
                .padding(.top,16)
                .padding(.bottom,16)
                .padding(.leading,16)
                .padding(.trailing,16)
            }
        }}}

struct register_activity_Previews: PreviewProvider {
    static var previews: some View {
        register_activity()
    }
}
