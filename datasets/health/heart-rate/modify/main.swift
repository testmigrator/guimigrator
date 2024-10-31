import SwiftUI
struct main: View {

    var body: some View {
        VStack
        {
            HStack
            {
                Text("--")
                    .font(.system(size: 32))
                ZStack
                {
                    ZStack{}
                }
            }
            .frame(minHeight:50,idealHeight:50)
            .padding(.leading,10)
            .padding(.trailing,10)
            ZStack{}
                .frame(minHeight:0,idealHeight:0)
        }}}

struct main_Previews: PreviewProvider {
    static var previews: some View {
        main()
    }
}
