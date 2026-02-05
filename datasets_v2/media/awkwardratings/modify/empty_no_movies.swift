import SwiftUI
struct empty_no_movies: View {

var body: some View {
VStack
{
Text("Oops, we couldn't get any movies")
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
Button(action: {})
{
Text("Try again")
.foregroundColor(.white)
}

}
.background(Color.black)
.frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct empty_no_movies_Previews: PreviewProvider {
    static var previews: some View {
        empty_no_movies()
    }
}
