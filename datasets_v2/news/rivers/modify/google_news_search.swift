import SwiftUI
struct google_news_search: View {
    
    var body: some View {
        VStack
        {
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .frame(minWidth:0,maxWidth:.infinity)
            .listStyle(PlainListStyle())
            TextField("", text: .constant(""))
                .frame(minWidth:0,maxWidth:.infinity)
            HStack
            {
                Button(action: {})
                {
                    Text("Search")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.blue)
                Button(action: {})
                {
                    Text("Bookmark")
                        .foregroundColor(.black)
                }
                .frame(minWidth:0,maxWidth:.infinity)
                .background(Color.blue)
            }
            .frame(minWidth:0,maxWidth:.infinity)
            List
            {
                ForEach(1..<10)
                {
                    index in
                    Text("Item \(index)")
                }
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            .listStyle(PlainListStyle())
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct google_news_search_Previews: PreviewProvider {
    static var previews: some View {
        google_news_search()
    }
}
