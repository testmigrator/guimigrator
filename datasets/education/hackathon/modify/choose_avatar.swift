import SwiftUI
struct choose_avatar: View {
    
    var body: some View {
        VStack
        {
            Text("Choose your avatar")
                .frame(minWidth:298,idealWidth:298)
                .padding(.top,45)
                .bold()
                .font(.system(size: 30))
                .foregroundColor(Color(red:0.9411765,green:0.5019608,blue:0.5019608,opacity:1.0))
            VStack
            {
                Text("अपने अवतार चुनें ")
                    .font(.system(size: 30))
                    .foregroundColor(Color(red:0.9411765,green:0.5019608,blue:0.5019608,opacity:1.0))
                HStack
                {
                    Button(action: {})
                    {
                        Text("null")
                            .foregroundColor(.black)
                            .hidden()
                    }
                    .background(Color.blue)
                    .padding(.top,150)
                    .padding(.leading,75)
                    .overlay(Image("boy_transparent") )
                    Button(action: {})
                    {
                        Text("null")
                            .foregroundColor(.black)
                    }
                    .background(Color.blue)
                    .overlay(Image("girl_transparent") )
                
                    Text("Ratannरतन ")
                        .hidden()
                        .font(.system(size: 25))
                        .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                }
            }
            Text("Latanलता")
                .hidden()
                .font(.system(size: 25))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Image("rsz_home_bg").resizable())}}

struct choose_avatar_Previews: PreviewProvider {
    static var previews: some View {
        choose_avatar()
    }
}
