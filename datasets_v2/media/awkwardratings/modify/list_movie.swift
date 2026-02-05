import SwiftUI
struct list_movie: View {
    
    var body: some View {
        HStack
        {
            Image("")
                .frame(minWidth:68,idealWidth:68,minHeight:100,idealHeight:100)
                .background(.white)
            VStack
            {
                Text("The Avengers\nWhat Very long title what")
                    .frame(minWidth:0,idealWidth:0)
                    .font(.system(size: 20))
                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                    .lineLimit(2)
                    .truncationMode(.tail)
                Text("86% awkward")
                    .frame(minWidth:0,idealWidth:0)
                    .font(.system(size: 15))
                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                
            }
            .frame(minWidth:0,idealWidth:0,minHeight:100,idealHeight:100)
            .padding(8)
            Spacer()
            VStack
            {
                Button(action: {})
                {
                    Text("AWK")
                        .foregroundColor(.black)
                }
                .frame(minWidth:68,idealWidth:68,minHeight:0,idealHeight:0)
                .background(Color.black)
                Button(action: {})
                {
                    Text("NOT")
                        .foregroundColor(.black)
                }
                .frame(minWidth:68,idealWidth:68,minHeight:0,idealHeight:0)
                .background(Color.black)
            }
            .frame(minWidth:68,idealWidth:68,minHeight:100,idealHeight:100)
        }
        .background(.black)
        .frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)}}

struct list_movie_Previews: PreviewProvider {
    static var previews: some View {
        list_movie()
    }
}
