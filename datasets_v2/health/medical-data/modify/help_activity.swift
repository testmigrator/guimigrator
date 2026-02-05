import SwiftUI
struct help_activity: View {
    
    var body: some View {
        ScrollView
        {
            ZStack
            {
                ZStack
                {
                    VStack
                    {
                        HStack
                        {
                     
                            Text("help")
                                .padding(.top,25)
                                .padding(.leading,16)
                                .padding(.trailing,16)
                                .padding(.leading,16)
                            Spacer()
                        }
                        Text("help description")
                            .padding(.top,5)
                            .padding(.bottom,30)
                            .padding(.trailing,16)
                            .padding(.trailing,16)
                    }
                }
                .padding(.top,25)
                .padding(.bottom,35)
                .padding(.leading,16)
                .padding(.trailing,16)
                .background(Image("border").resizable())
            }
        }}}

struct help_activity_Previews: PreviewProvider {
    static var previews: some View {
        help_activity()
    }
}
