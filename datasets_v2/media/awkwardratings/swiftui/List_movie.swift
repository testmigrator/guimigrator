import SwiftUI

struct List_movie: View {
  var body: some View {
    HStack(alignment: .center, spacing: 0) {
      Image(systemName: "photo").resizable().scaledToFit().frame(maxHeight: .infinity).frame(width: 68.0)
      VStack(alignment: .leading, spacing: 0) {
        Text("The Avengers\\nWhat Very long title what").font(.system(size: 20)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
        Text("50% awkward").font(.system(size: 15)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      .padding(8.0)
      VStack(alignment: .leading, spacing: 0) {
        Button(action: { }) {
          Text("AWK")
        }
        .disabled(false)
        .background(Color.clear)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
        Button(action: { }) {
          Text("NOT")
        }
        .disabled(false)
        .background(Color.clear)
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxHeight: .infinity)
      .frame(width: 68.0)
    }
    .frame(maxWidth: .infinity)
    .frame(height: 100.0)
  }
}

struct List_movie_Previews: PreviewProvider {
  static var previews: some View {
    List_movie()
  }
}
