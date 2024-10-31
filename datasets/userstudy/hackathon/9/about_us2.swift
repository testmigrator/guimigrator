import SwiftUI
struct about_us: View {
    
    var body: some View {
        VStack
        {
            Text("About Us")
                .bold()
                .font(.system(size: 50))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Image("rsz_ow")
                .frame(minWidth:200,idealWidth:200,minHeight:200,idealHeight:200)
                .background(Color.black)
                .padding(.top,4)
            Image("sah")
                .frame(minWidth:400,idealWidth:400,minHeight:100,idealHeight:100)
                .background(Color.black)
                .padding(.top,4)
            Text("v 0.0.1")
                .frame(minWidth:372,idealWidth:372)
                .italic()
                .foregroundColor(Color(red:0.9411765,green:0.5019608,blue:0.5019608,opacity:1.0))
            Text("Made with ♥ for India, in India. ")
                .padding(.top,20)
                .bold()
                .font(.system(size: 20))
                .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
            Text("http://neophytes.github.io/microsoft-pragyan-hackathon/")
                .padding(.top,32)
                .italic()
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Image("rsz_home_bg").resizable())}}

struct about_us_Previews: PreviewProvider {
    static var previews: some View {
        about_us()
    }
}
