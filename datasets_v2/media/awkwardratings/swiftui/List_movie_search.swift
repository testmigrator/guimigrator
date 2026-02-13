import SwiftUI

struct List_movie_search: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxHeight: .infinity).frame(width: 68.0)
      VStack(alignment: .leading, spacing: 0) {
        Text("The Avengers\\nWhat Very long title what").font(.system(size: 20)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
        Text("March 2015")
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(8.0)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 100.0)
  }
}

struct List_movie_search_Previews: PreviewProvider {
  static var previews: some View {
    List_movie_search()
  }
}
