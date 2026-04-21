import SwiftUI

struct Fragment_intro: View {
  var body: some View {
    ScrollView {
      VStack(alignment: .leading, spacing: 0) {
        Text("Welcome to...").font(.system(size: 14)).padding(.bottom, 16.0)
        Text("Awkward Ratings").font(.system(size: 34)).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .center)
        Text("the app where you find out which movies\\nwould be awkward to watch with your parents...").font(.system(size: 14)).padding(.bottom, 16.0)
        Text("...or the app where you find out which movies\\nwould be awkward to watch with your kids.").font(.system(size: 14)).multilineTextAlignment(.trailing).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .trailing)
        Text("Whichever floats your boat.").font(.system(size: 14)).padding(.bottom, 16.0)
        Text("Awkward ratings for each movie\\nare done by you, our users...").font(.system(size: 14)).multilineTextAlignment(.trailing).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .trailing)
        Text("...and a warehouse full of movie elves.").font(.system(size: 14)).padding(.bottom, 16.0)
        Text("So go help those elves out...").font(.system(size: 14)).multilineTextAlignment(.trailing).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .trailing)
        Text("").padding(.bottom, 16.0)
        Text("...or not.").font(.system(size: 14)).padding(.bottom, 16.0)
        Text("- Nasah Apps").font(.system(size: 18)).multilineTextAlignment(.trailing).padding(.bottom, 16.0).frame(maxWidth: .infinity, alignment: .trailing)
        Group {
        Button(action: { }) {
          Text("Let's get started")
        }
        .disabled(false)
        }
        .frame(maxWidth: .infinity, alignment: .trailing)
      }
      .frame(maxWidth: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.top, 16.0)
    .padding(.bottom, 16.0)
  }
}

struct Fragment_intro_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_intro()
  }
}
