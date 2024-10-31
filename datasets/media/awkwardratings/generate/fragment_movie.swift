import SwiftUI
struct fragment_movie: View {

var body: some View {
ZStack
{
ScrollView
{
ZStack
{
Image("")
.frame(minWidth:0,maxWidth:.infinity,minHeight:200,idealHeight:200)
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:200,idealHeight:200)
.background(Color.blue)
VStack
{
HStack
{
Image("")
.frame(minWidth:108,idealWidth:108,minHeight:160,idealHeight:160)
.opacity(0.0)
VStack
{
Text("Best Movie Ever")
.font(.system(size: 22))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.opacity(0.0)
Text("October 2014 \u00b7 119 minutes")
.font(.system(size: 15))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,40)
.padding(.leading,16)
.padding(.trailing,16)
}
.frame(minWidth:0,maxWidth:.infinity)
ZStack
{
HStack
{
Button(action: {})
{
Text("NOT")
.foregroundColor(.black)
}
.frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
.background(Color.blue)
HStack
{
Button(action: {})
{
Text("null")
.foregroundColor(.black)
}
.frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
.background(Color.blue)
.padding(.leading,32)
.padding(.trailing,32)
Button(action: {})
{
Text("AWK")
.foregroundColor(.black)
}
.frame(minWidth:56,idealWidth:56,minHeight:56,idealHeight:56)
.background(Color.blue)
}
}
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top,16)
Text("awkward")
.padding(.top,2)
.opacity(0.0)
HStack
{
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
.frame(minHeight:1,idealHeight:1)
.padding(.top,16)
.padding(.bottom,16)
.padding(.trailing,16)
Text("K E Y W O R D S")
.opacity(0.0)
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
.frame(minHeight:1,idealHeight:1)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
}
.frame(minWidth:0,maxWidth:.infinity)
Text("times square, superhero, long take, new york city, play, broadway, death of superhero, actor")
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.opacity(0.0)
HStack
{
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
.frame(minHeight:1,idealHeight:1)
.padding(.top,16)
.padding(.bottom,16)
.padding(.trailing,16)
Text("O V E R V I E W")
.opacity(0.0)
Rectangle()
.fill(Color(red:1.0,green:1.0,blue:1.0,opacity:0.6666667))
.frame(minHeight:1,idealHeight:1)
.padding(.top,16)
.padding(.bottom,16)
.padding(.leading,16)
}
.frame(minWidth:0,maxWidth:.infinity)
Text("A story about love, passion, and plenty of explosions, the Robot Man finds his way through time to stop the evil aliens from taking over Russia.")
.frame(minWidth:0,maxWidth:.infinity)
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.opacity(0.0)
}
.frame(minWidth:0,maxWidth:.infinity)
.padding(.top)
.padding(16)
}
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
Rectangle()
.frame(minWidth:0,maxWidth:.infinity)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct fragment_movie_Previews: PreviewProvider {
    static var previews: some View {
        fragment_movie()
    }
}
