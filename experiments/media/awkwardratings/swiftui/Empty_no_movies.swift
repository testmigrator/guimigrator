import SwiftUI

struct Empty_no_movies: View {
  var body: some View {
    VStack(alignment: .center, spacing: 0) {
      Text("Oops, we couldn't get any movies").foregroundColor(Color.clear)
      Button(action: { }) {
        Text("Try again").foregroundColor(Color.clear)
      }
      .disabled(false)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Empty_no_movies_Previews: PreviewProvider {
  static var previews: some View {
    Empty_no_movies()
  }
}
