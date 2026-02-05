import SwiftUI
struct home_grid: View {
    
    var body: some View {
        ZStack
        {
            VStack
            {
                HStack
                {
                    Spacer()
                    Button(action: {})
                    {
                        Text("null")
                            .foregroundColor(.black)
                    }
                    .frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
                    .background(Color.blue)
                    .padding(.top,56)
                    .padding(.leading,52)
                    .padding(.leading,52)
                }
                Text("Know the world")
                    .font(.system(size: 12))
                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            }
            HStack
            {
                Button(action: {})
                {
                    Text("null")
                        .foregroundColor(.black)
                }
                .frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
                .background(Color.blue)
                Button(action: {})
                {
                    Text("null")
                        .foregroundColor(.black)
                }
                .frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
                .background(Color.blue)
                .padding(.trailing,65)
                .padding(.trailing,65)
            }
            Button(action: {})
            {
                Text("null")
                    .foregroundColor(.black)
            }
            .frame(minWidth:100,idealWidth:100,minHeight:100,idealHeight:100)
            .background(Color.blue)
            .padding(.top,59)
            Text(" दुनिया को पता")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("Our India")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("हमारा भारत")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("Internet")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("इंटरनेट")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("Learn English")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("अंग्रेजी सीखिये")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("About Us")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("हमारे बारे में")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("Our Government")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("हमारी सरकार ")
                .font(.system(size: 12))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Image("rsz_home_bg").resizable())}}

struct home_grid_Previews: PreviewProvider {
    static var previews: some View {
        home_grid()
    }
}
