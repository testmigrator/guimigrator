import SwiftUI

struct Activity_game: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Image("android_hangman_gallows").padding(.top, 0.0)
        Image("android_hangman_head").padding(.top, 23.0)
        Image("android_hangman_body").padding(.top, 53.0)
        Image("android_hangman_arm1").padding(.top, 60.0)
        Image("android_hangman_arm2").padding(.top, 60.0)
        Image("android_hangman_leg1").padding(.top, 90.0)
        Image("android_hangman_leg2").padding(.top, 90.0)
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(.top, 15.0)
      .padding(.leading, 20.0)
      .padding(.trailing, 20.0)
      .padding(.top, 30.0)
      HStack(alignment: .center, spacing: 0) {
      }
      .background(Color(red: 1, green: 1, blue: 1, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(10.0)
      .padding(.leading, 20.0)
      .padding(.trailing, 20.0)
      .padding(.bottom, 5.0)
      Text("Hints").font(.system(size: 17)).foregroundColor(Color(red: 1, green: 1, blue: 1, opacity: 1)).multilineTextAlignment(.center).frame(maxWidth: .infinity, alignment: .center).frame(height: 50.0).padding(.top, 20.0).frame(maxWidth: .infinity, alignment: .center)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
      .frame(maxWidth: .infinity)
      .padding(5.0)
      .padding(.leading, 20.0)
      .padding(.trailing, 20.0)
      .padding(.bottom, 5.0)
      }
      .frame(maxWidth: .infinity, alignment: .center)
    }
    .background(Color(red: 0, green: 0, blue: 0, opacity: 1))
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Activity_game_Previews: PreviewProvider {
  static var previews: some View {
    Activity_game()
  }
}
