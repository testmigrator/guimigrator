import SwiftUI

struct Fragment_vote: View {
  var body: some View {
    ZStack {
      VStack(alignment: .leading, spacing: 0) {
        ScrollView {
          VStack(alignment: .leading, spacing: 0) {
            Spacer()
            .frame(maxWidth: .infinity)
            Group {
            VStack(alignment: .leading, spacing: 0) {
              VStack(alignment: .leading, spacing: 0) {
                Image(systemName: "photo").resizable().scaledToFill().frame(maxWidth: .infinity).padding(.leading, 4.0).padding(.trailing, 4.0).padding(.top, 4.0)
                Text("@+id/voteFooterTextView").font(.system(size: 12)).foregroundColor(Color.clear).frame(maxWidth: .infinity, alignment: .leading).padding(16.0)
              }
              .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity)
            }
            .frame(maxWidth: .infinity, alignment: .center)
            Spacer()
            .frame(maxWidth: .infinity)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      Group {
      VStack(alignment: .leading, spacing: 0) {
      }
      .padding(16.0)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
      ProgressView().frame(maxWidth: .infinity, alignment: .center)
      Image("ic_error_white_48dp").frame(maxWidth: .infinity, alignment: .center)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
  }
}

struct Fragment_vote_Previews: PreviewProvider {
  static var previews: some View {
    Fragment_vote()
  }
}
