import SwiftUI

struct Cardview_budget_amount: View {
  var body: some View {
    VStack(alignment: .leading, spacing: 0) {
      ZStack {
        Group {
        HStack(alignment: .center, spacing: 0) {
          Text("Expenses:Phone:Android").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          Text("$ 3000").font(.system(size: 16)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        .padding(.bottom, 10.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        HStack(alignment: .center, spacing: 0) {
          Text("Spent").font(.system(size: 14)).multilineTextAlignment(.leading).frame(maxWidth: .infinity, alignment: .leading).frame(maxWidth: .infinity)
          Text("Left").font(.system(size: 14)).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, alignment: .trailing).frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("$500").font(.system(size: 15)).foregroundColor(Color.black).multilineTextAlignment(.leading).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Text("$2,500").font(.system(size: 15)).foregroundColor(Color.black).multilineTextAlignment(.trailing).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
        ProgressView().frame(maxWidth: .infinity).frame(height: 10.0).padding(.top, 5.0).padding(.top, 15.0).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        Group {
        VStack(alignment: .leading, spacing: 0) {
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 10.0)
        .padding(.top, 15.0)
        }
        .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomLeading)
      }
      .frame(maxWidth: .infinity)
      .padding(10.0)
      .padding(.top, 10.0)
      .padding(.bottom, 10.0)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Cardview_budget_amount_Previews: PreviewProvider {
  static var previews: some View {
    Cardview_budget_amount()
  }
}
