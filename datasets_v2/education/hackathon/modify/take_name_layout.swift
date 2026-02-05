import SwiftUI
struct take_name_layout: View {
    
    var body: some View {
        VStack
        {
            Text("What is your name?")
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,50)
                .bold()
                .font(.system(size: 30))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("आपका नाम क्या है?")
                .font(.system(size: 30))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            TextField("", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
                .padding(.top,50)
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Button(action: {})
            {
                Text("OK")
                    .foregroundColor(.black)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .background(Color.gray)
            .padding(.top,30)
            .padding(.leading,20)
            .padding(.trailing,20)
            Image("hello")
                .resizable()
                .padding(.leading,20)
                .padding(.trailing,20)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Image("rsz_home_bg").resizable())}}

struct take_name_layout_Previews: PreviewProvider {
    static var previews: some View {
        take_name_layout()
    }
}
