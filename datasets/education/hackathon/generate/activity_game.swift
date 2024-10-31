import SwiftUI
struct activity_game: View {

var body: some View {
VStack
{
ZStack
{
Image("android_hangman_gallows")
.padding(.top,0)
.padding(.leading,0)
.accessibility(label: Text("The Gallows"))
Image("android_hangman_head")
.padding(.top,23)
.padding(.leading,108)
.accessibility(label: Text("The Head"))
Image("android_hangman_body")
.padding(.top,53)
.padding(.leading,120)
.accessibility(label: Text("The Body"))
Image("android_hangman_arm1")
.padding(.top,60)
.padding(.leading,100)
.accessibility(label: Text("An Arm"))
Image("android_hangman_arm2")
.padding(.top,60)
.padding(.leading,120)
.accessibility(label: Text("An Arm"))
Image("android_hangman_leg1")
.padding(.top,90)
.padding(.leading,101)
.accessibility(label: Text("A Leg"))
Image("android_hangman_leg2")
.padding(.top,90)
.padding(.leading,121)
.accessibility(label: Text("A Leg"))
}
.padding(.top,30)
.padding(.leading,20)
.padding(.trailing,20)
.padding(.top,15)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
HStack
{
Text("")
}
.padding(.bottom,5)
.padding(.leading,20)
.padding(.trailing,20)
.padding(10)
.background(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Text("Hints")
.frame(minWidth:0,maxWidth:.infinity,minHeight:50,idealHeight:50)
.padding(.top,20)
.font(.system(size: 17))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Rectangle()
.fill(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
.padding(.bottom,5)
.padding(.leading,20)
.padding(.trailing,20)
.padding(5)
}
.frame(minWidth:0,maxWidth:.infinity)
.background(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))}}

struct activity_game_Previews: PreviewProvider {
    static var previews: some View {
        activity_game()
    }
}
