import SwiftUI

struct Fragment_movie: View {
  var body: some View {
    ZStack {
      ScrollView {
        VStack(alignment: .leading, spacing: 0) {
          Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity).frame(height: 200.0)
          Button(action: { /* TODO */ }) {
            Image("ic_play")
          }
          .background(Color.clear)
          .frame(maxWidth: .infinity)
          .frame(height: 200.0)
          VStack(alignment: .leading, spacing: 0) {
            HStack(alignment: .center, spacing: 0) {
              Image(systemName: "photo").resizable().scaledToFit().frame(width: 108.0, height: 160.0)
              VStack(alignment: .leading, spacing: 0) {
                Text("Best Movie Ever").font(.system(size: 22)).foregroundColor(Color.clear)
                Text("October 2014 \\u00b7 119 minutes").font(.system(size: 15)).foregroundColor(Color.clear)
              }
              .frame(maxWidth: .infinity)
              .padding(.top, 40.0)
            }
            .frame(maxWidth: .infinity)
            ZStack {
              Group {
              Button(action: { }) {
                Text("NOT").foregroundColor(Color.clear)
              }
              .disabled(false)
              .background(Image("transparent_circle").resizable().scaledToFill())
              .frame(width: 56.0, height: 56.0)
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
              Group {
              Button(action: { }) {
                Text("86%").foregroundColor(Color.clear)
              }
              .disabled(false)
              .background(Image("transparent_circle").resizable().scaledToFill())
              .frame(width: 56.0, height: 56.0)
              .padding(.leading, 32.0)
              .padding(.trailing, 32.0)
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .top)
              Group {
              Button(action: { }) {
                Text("AWK").foregroundColor(Color.clear)
              }
              .disabled(false)
              .background(Image("transparent_circle").resizable().scaledToFill())
              .frame(width: 56.0, height: 56.0)
              }
              .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
            }
            .frame(maxWidth: .infinity)
            .padding(.top, 16.0)
            Text("awkward").padding(.top, 2.0).frame(maxWidth: .infinity, alignment: .center)
            HStack(alignment: .center, spacing: 0) {
              Rectangle().foregroundColor(Color.clear)
              .background(Color.clear)
              .frame(height: 1.0)
              .frame(maxWidth: .infinity)
              .padding(.trailing, 16.0)
              .padding(.top, 16.0)
              .padding(.bottom, 16.0)
              Text("K E Y W O R D S").frame(maxHeight: .infinity, alignment: .center)
              Rectangle().foregroundColor(Color.clear)
              .background(Color.clear)
              .frame(height: 1.0)
              .frame(maxWidth: .infinity)
              .padding(.leading, 16.0)
              .padding(.top, 16.0)
              .padding(.bottom, 16.0)
            }
            .frame(maxWidth: .infinity)
            Text("times square, superhero, long take, new york city, play, broadway, death of superhero, actor").foregroundColor(Color.clear).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
            HStack(alignment: .center, spacing: 0) {
              Rectangle().foregroundColor(Color.clear)
              .background(Color.clear)
              .frame(height: 1.0)
              .frame(maxWidth: .infinity)
              .padding(.trailing, 16.0)
              .padding(.top, 16.0)
              .padding(.bottom, 16.0)
              Text("O V E R V I E W").frame(maxHeight: .infinity, alignment: .center)
              Rectangle().foregroundColor(Color.clear)
              .background(Color.clear)
              .frame(height: 1.0)
              .frame(maxWidth: .infinity)
              .padding(.leading, 16.0)
              .padding(.top, 16.0)
              .padding(.bottom, 16.0)
            }
            .frame(maxWidth: .infinity)
            Text("A story about love, passion, and plenty of explosions, the Robot Man finds his way through time to stop the evil aliens from taking over Russia.").foregroundColor(Color.clear).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center)
          }
          .frame(maxWidth: .infinity)
          .padding(16.0)
          .padding(.top, -40.0)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      VStack(alignment: .leading, spacing: 0) {
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_movie_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_movie()
  }
}
