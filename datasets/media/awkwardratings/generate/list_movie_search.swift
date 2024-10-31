import SwiftUI
struct list_movie_search: View {

var body: some View {
HStack
{
Image("")
.frame(minWidth:68,idealWidth:68,minHeight:100,idealHeight:100)
VStack
{
Text("The Avengers\nWhat Very long title what")
.frame(minWidth:0,maxWidth:.infinity)
.font(.system(size: 20))
.foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
.lineLimit(2)
.truncationMode(.tail)
Text("March 2015")
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)
.padding(8)
}
.frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)}}

struct list_movie_search_Previews: PreviewProvider {
    static var previews: some View {
        list_movie_search()
    }
}
