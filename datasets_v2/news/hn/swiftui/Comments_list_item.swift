import SwiftUI

struct Comments_list_item: View {
  var body: some View {
    ZStack {
      HStack(alignment: .center, spacing: 0) {
        HStack(alignment: .center, spacing: 0) {
        }
        .frame(maxHeight: .infinity)
        ZStack {
          Text("someauthor").font(.system(size: 14)).foregroundColor(Color(red: 0.611764705882353, green: 0.5686274509803921, blue: 0.5254901960784314, opacity: 1))
          Text("").font(.system(size: 14)).foregroundColor(Color(red: 0.611764705882353, green: 0.5686274509803921, blue: 0.5254901960784314, opacity: 1)).frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topTrailing)
          Group {
          VStack(alignment: .leading, spacing: 0) {
          }
          .padding(.top, 10.0)
          .padding(.top, 14.0)
          }
          .frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .topLeading)
        }
        .frame(maxWidth: .infinity)
        .padding(.top, 3.0)
        .padding(.bottom, 12.0)
      }
      .frame(maxWidth: .infinity)
      Image("expand").frame(maxWidth: .infinity, maxHeight: .infinity, alignment: .bottomTrailing)
    }
    .frame(maxWidth: .infinity)
  }
}

struct Comments_list_item_Previews: PreviewProvider {
  static var previews: some View {
    Comments_list_item()
  }
}
