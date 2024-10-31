import SwiftUI
struct finish_activity: View {
    
    var body: some View {
        ScrollView
        {
            ZStack
            {
                ZStack
                {
                    VStack
                    {
                        ZStack
                        {
                            Text("Thanks! Your answers have been correctly sent")
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                .padding(.leading,16)
                                .padding(.top,16)
                                .padding(.bottom,16)
                        }
                        .padding(.top,16)
                        .padding(.bottom,16)
                        .padding(.leading,16)
                        .padding(.trailing,16)
                        .background(Image("border").resizable())
                        Button(action: {})
                        {
                            Text("ACCEPT")
                                .foregroundColor(.black)
                        }
                        .background(Color.white)
                        .padding(.top,80)
                    }
                }
                .padding(.top,50)
                .padding(.bottom,50)
                .padding(.leading,30)
                .padding(.trailing,30)
            }
        }}}

struct finish_activity_Previews: PreviewProvider {
    static var previews: some View {
        finish_activity()
    }
}
