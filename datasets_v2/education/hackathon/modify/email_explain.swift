import SwiftUI
struct email_explain: View {
    
    var body: some View {
        ZStack
        {
            Image("email_struct")
                .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            VStack
            {
                Text("")
                    .frame(minWidth:5,idealWidth:5,minHeight:10,idealHeight:10)
                    .padding(.top,180)
                    .padding(.leading,70)
                Text("")
                    .frame(minWidth:70,idealWidth:70,minHeight:20,idealHeight:20)
                    .padding(.top,20)
                    .padding(.leading,70)
            }
            Text("")
                .frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)
                .padding(.top,90)
                .padding(.leading,30)
                .padding(.trailing,180)
            Button(action: {})
            {
                Text("Continue")
                    .foregroundColor(.black)
            }
            .background(Color.blue)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct email_explain_Previews: PreviewProvider {
    static var previews: some View {
        email_explain()
    }
}
