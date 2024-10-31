import SwiftUI
struct profile_activity: View {
    @State private  var gender_answer  : String?
    var body: some View {
        ScrollView
        {
            ZStack
            {
                VStack
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
                    Text("INTRODUCE YOUR PIN")
                        .padding(.top,23)
                    Button(action: {})
                    {
                        Text("SAVE CHANGES")
                            .foregroundColor(.black)
                    }
                    .background(Color.white)
                    .padding(.top,40)
                    .padding(.bottom,60)
                }
                .padding(.top,16)
                .padding(.bottom,16)
                .padding(.leading,16)
                .padding(.trailing,16)
            }
        }}}

struct profile_activity_Previews: PreviewProvider {
    static var previews: some View {
        profile_activity()
    }
}
