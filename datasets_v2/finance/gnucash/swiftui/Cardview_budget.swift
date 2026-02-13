import SwiftUI

struct Cardview_budget: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      VStack(alignment: .leading, spacing: 0) {
        VStack(alignment: .leading, spacing: 0) {
          Text("Primary text").font(.system(size: 20)).foregroundColor(Color.black).multilineTextAlignment(.center)
          Text("Secondary text")
        }
        .frame(maxWidth: .infinity)
        Text("$2,500 monthly until 02/14").font(.system(size: 15)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).padding(.leading, 10.0).padding(.trailing, 10.0)
        ZStack {
          Image("ic_more_vert_black_24dp").resizable().scaledToFit().background(Color.clear).frame(width: 48.0, height: 48.0).padding(.top, 20.0).padding(.bottom, 4.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
          Group {
          VStack(alignment: .leading, spacing: 0) {
            Text("$ 2000 of $ 2,500").font(.system(size: 18)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).padding(5.0)
            ProgressView().frame(maxWidth: .infinity).frame(height: 10.0).padding(.bottom, 4.0)
          }
          .frame(maxWidth: .infinity)
          .padding(.leading, 10.0)
          .padding(.trailing, 10.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
      }
      .frame(maxWidth: .infinity, maxHeight: .infinity)
    }
    .frame(maxWidth: .infinity, maxHeight: .infinity)
    .padding(.leading, 5.0)
    .padding(.trailing, 5.0)
  }
}

struct Cardview_budget_Previews: PreviewProvider {
  static var previews: some View {
    Cardview_budget()
  }
}
