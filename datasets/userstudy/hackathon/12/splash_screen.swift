import SwiftUI
struct splash_screen: View {

var body: some View {
VStack
{
Image("rsz_ow")
.frame(minWidth:200,idealWidth:200,minHeight:200,idealHeight:200)
.background(Color.black)
.padding(.top,70)
Image("sah")
.frame(minWidth:400,idealWidth:400,minHeight:100,idealHeight:100)
.background(Color.black)
.padding(.top,4)
Text("सीखो  सिखाअो,  पढ़ो  पढ़ाअो,  ")
.padding(.top,10)
.font(.system(size: 26))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("ङिजिटल  इिॱङिया  बनाअो  !")
.font(.system(size: 26))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("Towards a Stronger Digital India")
.padding(.top,12)
.bold()
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.background(Image("rsz_home_bg").resizable())}}

struct splash_screen_Previews: PreviewProvider {
    static var previews: some View {
        splash_screen()
    }
}
