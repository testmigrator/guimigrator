import SwiftUI
struct fragment_intro: View {

var body: some View {
ScrollView
{
VStack
{
Text("Welcome to...")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("Awkward Ratings")
.padding(.bottom,16)
.font(.system(size: 34))
.opacity(0.0)
Text("the app where you find out which movies\nwould be awkward to watch with your parents...")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("...or the app where you find out which movies\nwould be awkward to watch with your kids.")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("Whichever floats your boat.")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("Awkward ratings for each movie\nare done by you, our users...")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("...and a warehouse full of movie elves.")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("So go help those elves out...")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("")
.padding(.bottom,16)
Text("...or not.")
.padding(.bottom,16)
.font(.system(size: 14))
.opacity(0.0)
Text("- Nasah Apps")
.padding(.bottom,16)
.font(.system(size: 18))
.opacity(0.0)
Button(action: {})
{
Text("Let's get started")
.foregroundColor(.black)
}
.background(Color.blue)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
.padding(.trailing,16)}}

struct fragment_intro_Previews: PreviewProvider {
    static var previews: some View {
        fragment_intro()
    }
}
